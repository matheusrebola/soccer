package soccervs.statics.core.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.statics.core.dtos.ElencoCreateDTO;
import soccervs.statics.core.dtos.ElencoDTO;
import soccervs.statics.core.entities.Elencos;
import soccervs.statics.core.mappers.ElencoMapper;
import soccervs.statics.core.resources.exceptions.NotFoundedException;
import soccervs.statics.core.resources.exceptions.NotPersistedException;
import soccervs.statics.core.services.ElencoService;

@RestController
@RequestMapping("/elencos")
public class ElencosController {
	
	@Autowired
	private final ElencoMapper mapper; 
	
	private final ElencoService service;
	
	public ElencosController(ElencoMapper mapper, ElencoService service) {this.mapper = mapper;this.service = service;}

	@PostMapping
	public ResponseEntity<ElencoDTO> cadastrarElencos(@RequestBody ElencoCreateDTO create) {
		Elencos elenco = mapper.map(create);
		Elencos saved = service.salvar(elenco);
		
		if (saved == null) {
			throw new NotPersistedException("Elenco não persistido");
		}
		Long id = saved.getId();
		URI location = URI.create("/elencos/"+id);
		ElencoDTO dto = mapper.map(saved);
		return ResponseEntity.created(location).body(dto);
	}
	
	@GetMapping
	public ResponseEntity<List<ElencoDTO>> encontrarTodos() {
		List<Elencos> elenco = service.encontrarTodos();
		
		if (elenco.isEmpty()) {
			throw new NotFoundedException("Elencos não encontradas");
		}
		List<ElencoDTO> dto = mapper.map(elenco);
		return ResponseEntity.ok(dto);
	}
}
