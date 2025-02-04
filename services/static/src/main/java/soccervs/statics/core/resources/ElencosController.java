package soccervs.statics.core.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.statics.core.dtos.ElencoCreateDTO;

@RestController
@RequestMapping("/elencos")
public class ElencosController {

	@PostMapping
	public void cadastrarElencos(@RequestBody ElencoCreateDTO create) {
		
	}
	
	@GetMapping
	public void encontrarTodos() {
		
	}
}
