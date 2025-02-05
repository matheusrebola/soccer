package soccervs.statics.core.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.statics.core.dtos.TecnicoCreateDTO;
import soccervs.statics.core.dtos.TecnicoDTO;
import soccervs.statics.core.entities.Tecnicos;
import soccervs.statics.core.mappers.TecnicoMapper;
import soccervs.statics.core.resources.exceptions.NotPersistedException;
import soccervs.statics.core.services.TecnicoService;

@RestController
@RequestMapping("/tecnicos")
public class TecnicosController {

	@Autowired
	private TecnicoMapper mapper;
	
	@Autowired
	private TecnicoService service;
	
	@PostMapping
	public ResponseEntity<TecnicoDTO> cadastrarTecnico(@RequestBody TecnicoCreateDTO createDTO) {
		Tecnicos tecnico = mapper.map(createDTO);
		Tecnicos saved = service.salvar(tecnico);
		
		if (saved == null) {
			throw new NotPersistedException("Tecnico não persistido");
		}
		
		Integer id = service.pegarId(saved);
		URI location = URI.create("/tecnicos/"+id);
		TecnicoDTO dto = mapper.map(saved);
		
		return ResponseEntity.created(location).body(dto);
	}
	
}
