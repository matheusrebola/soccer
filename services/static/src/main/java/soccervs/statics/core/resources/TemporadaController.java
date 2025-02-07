package soccervs.statics.core.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.statics.core.dtos.TemporadaCreateDTO;
import soccervs.statics.core.dtos.TemporadaDTO;
import soccervs.statics.core.entities.Temporadas;
import soccervs.statics.core.mappers.TemporadaMapper;
import soccervs.statics.core.resources.exceptions.NotPersistedException;
import soccervs.statics.core.services.TemporadaService;

@RestController
@RequestMapping("/temporadas")
public class TemporadaController {
	
	@Autowired
	private final TemporadaMapper mapper;
	
	@Autowired
	private final TemporadaService service;
	
	public TemporadaController(TemporadaMapper mapper, TemporadaService service) {
		this.mapper = mapper;
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<TemporadaDTO> cadastrarTemporada(@RequestBody TemporadaCreateDTO createDTO) {
		Temporadas temporada = mapper.map(createDTO);
		Temporadas saved = service.salvar(temporada);
		
		if(saved == null) {
			throw new NotPersistedException("Temporada não persistida");
		}
		
		Long id = saved.getId();
		URI location = URI.create("/temporadas/"+id);
		TemporadaDTO dto = mapper.map(saved);
		
		return ResponseEntity.created(location).body(dto);
	}
	

}
