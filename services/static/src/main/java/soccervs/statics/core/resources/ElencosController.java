package soccervs.statics.core.resources;

import java.net.URI;

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
import soccervs.statics.core.resources.exceptions.NotPersistedException;
import soccervs.statics.core.services.ElencoService;

@RestController
@RequestMapping("/elencos")
public class ElencosController {
	
	@Autowired
	private ElencoMapper mapper; 
	
	private ElencoService service;

	@PostMapping
	public ResponseEntity<ElencoDTO> cadastrarElencos(@RequestBody ElencoCreateDTO create) {
		Elencos elenco = mapper.map(create);
		Elencos saved = service.salvar(elenco);
		
		if (saved == null) {
			throw new NotPersistedException("Competicao não persistida");
		}
		Integer id = service.pegarId(elenco);
		URI location = URI.create("/elencos/"+id);
		ElencoDTO dto = mapper.map(saved);
		return ResponseEntity.created(location).body(dto);
	}
	
	@GetMapping
	public void encontrarTodos() {
		
	}
}
