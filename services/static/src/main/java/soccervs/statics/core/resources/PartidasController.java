package soccervs.statics.core.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.statics.core.dtos.PartidaCreateDTO;
import soccervs.statics.core.mappers.PartidasMapper;
import soccervs.statics.core.services.PartidasService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/partidas")
public class PartidasController {

	@Autowired
	private PartidasMapper mapper;

	@Autowired
	private PartidasService service;
	
	@PostMapping
	public void cadastrarPartida(@RequestBody PartidaCreateDTO createDTO) {
		
	}
	
}
