package soccervs.statics.core.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.statics.core.dtos.TituloCreateDTO;
import soccervs.statics.core.dtos.TituloDTO;
import soccervs.statics.core.entities.Titulos;
import soccervs.statics.core.mappers.TitulosMapper;
import soccervs.statics.core.resources.exceptions.NotPersistedException;
import soccervs.statics.core.services.TitulosService;

@RestController
@RequestMapping("/titulos")
public class TitulosController {

	@Autowired
	private final TitulosMapper mapper;
	
	@Autowired
	private final TitulosService service;

	public TitulosController(TitulosMapper mapper, TitulosService service) {
		this.mapper = mapper;
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<TituloDTO> cadastrarTitulo(@RequestBody TituloCreateDTO createDTO) {
		Titulos titulo = mapper.map(createDTO);
		Titulos saved = service.salvar(titulo);
		
		if (saved == null) {
			throw new NotPersistedException("Titulo não persistido");
		}
		Long id = saved.getId();
		URI location = URI.create("/titulos/" + id);
		TituloDTO dto = mapper.map(saved);
		
		return ResponseEntity.created(location).body(dto);
	}
	
	
	
}
