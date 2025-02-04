package soccervs.statics.core.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.statics.core.dtos.PartidaCreateDTO;
import soccervs.statics.core.dtos.PartidaDTO;
import soccervs.statics.core.entities.Partidas;
import soccervs.statics.core.mappers.PartidasMapper;
import soccervs.statics.core.resources.exceptions.NotPersistedException;
import soccervs.statics.core.services.PartidasService;


@RestController
@RequestMapping("/partidas")
public class PartidasController {

	@Autowired
	private PartidasMapper mapper;

	@Autowired
	private PartidasService service;
	
	@PostMapping
	public ResponseEntity<PartidaDTO> cadastrarPartida(@RequestBody PartidaCreateDTO createDTO) {
		Partidas partida = mapper.map(createDTO);
		Partidas saved = service.salvar(partida);
		
		if (saved == null) {
			throw new NotPersistedException("Partida não persistida");
		}
		
		Long id = service.pegarId(partida);
		URI location = URI.create("/partidas/"+id);
		PartidaDTO dto = mapper.map(saved);
		
		return ResponseEntity.created(location).body(dto);
	}
	
	@GetMapping
	public void encontrarTodos() {
		
	}
	
}
