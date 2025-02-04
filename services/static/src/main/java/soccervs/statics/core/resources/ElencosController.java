package soccervs.statics.core.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.statics.core.dtos.ElencoCreateDTO;
import soccervs.statics.core.entities.Elencos;
import soccervs.statics.core.mappers.ElencoMapper;

@RestController
@RequestMapping("/elencos")
public class ElencosController {
	
	@Autowired
	private ElencoMapper mapper; 
	
	private ElencoService service;

	@PostMapping
	public void cadastrarElencos(@RequestBody ElencoCreateDTO create) {
		Elencos elenco = mapper.map(create);
		Elencos saved = service.salvar(elenco);
	}
	
	@GetMapping
	public void encontrarTodos() {
		
	}
}
