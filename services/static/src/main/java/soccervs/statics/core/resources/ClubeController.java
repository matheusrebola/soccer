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

import soccervs.statics.core.dtos.ClubeCreateDTO;
import soccervs.statics.core.dtos.ClubeDTO;
import soccervs.statics.core.entities.Clubes;
import soccervs.statics.core.mappers.ClubeMapper;
import soccervs.statics.core.resources.exceptions.NotFoundedException;
import soccervs.statics.core.services.ClubeService;

@RestController
@RequestMapping("/clubes")
public class ClubeController {
	
	@Autowired
    private ClubeMapper mapper;
	
	@Autowired
	private ClubeService service;
	
	@PostMapping
	public ResponseEntity<ClubeDTO> cadastrarClube(@RequestBody ClubeCreateDTO createDTO) {
		Clubes clube = mapper.map(createDTO);
		Clubes clubeSaved = service.save(clube);
		Short id = service.getId(clubeSaved);
		ClubeDTO dto = mapper.map(clubeSaved);
		URI location = URI.create("/clubes/" + id);
		return ResponseEntity.created(location).body(dto);
	}
	
	@GetMapping
	public ResponseEntity<List<ClubeDTO>> encontrarTodos() {
	    List<Clubes> clubes = service.findAll();
	    if (clubes.isEmpty()) {
	        throw new NotFoundedException("Clube não encontrado");
	    }
	    List<ClubeDTO> dto = mapper.map(clubes);
	    return ResponseEntity.ok(dto);
	}
	
	public void encontrarPorCidade() {
		
	}
	
	public void encontrarPorPais() {
		
	}
	
	public void encontrarPorTecnico() {
		
	}
}
