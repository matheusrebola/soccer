package soccervs.statics.core.resources;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.statics.core.dtos.TemporadaCreateDTO;
import soccervs.statics.core.entities.Temporadas;

@RestController
@RequestMapping("/temporadas")
public class TemporadaController {
	
	
	
	@PostMapping
	public String cadastrarTemporada(@RequestBody TemporadaCreateDTO createDTO) {
		Temporadas temporada = mapper.map(createDTO);
		
		return entity;
	}
	

}
