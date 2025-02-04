package soccervs.statics.core.resources;

import java.net.URI;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.statics.core.dtos.ClubeByCityDTO;
import soccervs.statics.core.dtos.ClubeCreateDTO;
import soccervs.statics.core.dtos.ClubeDTO;
import soccervs.statics.core.entities.Clubes;
import soccervs.statics.core.mappers.ClubeMapper;
import soccervs.statics.core.resources.exceptions.NotFoundedException;
import soccervs.statics.core.resources.exceptions.NotPersistedException;
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
	    Clubes clubeSaved = service.salvar(clube);

	    if (clubeSaved == null) {
	        throw new NotPersistedException("Clube não persistido");
	    }

	    Short id = service.pegarId(clubeSaved);
	    ClubeDTO dto = mapper.map(clubeSaved);
	    URI location = URI.create("/clubes/" + id);

	    return ResponseEntity.created(location).body(dto);
	}
	
	@GetMapping
	public ResponseEntity<List<ClubeDTO>> encontrarTodos() {
	    List<Clubes> clubes = service.encontrarTodos();
	    if (clubes.isEmpty()) {
	        throw new NotFoundedException("Clube não encontrado");
	    }
	    List<ClubeDTO> dto = mapper.map(clubes);
	    return ResponseEntity.ok(dto);
	}
	
	@GetMapping("/cidade")
	public ResponseEntity<Set<ClubeByCityDTO>> encontrarPorCidade(@RequestBody String cidade) {
		Set<ClubeByCityDTO> dto = service.encontrarPelaCidade(cidade);
		if(dto.isEmpty()) {
			throw new NotFoundedException("Clube não encontrado por cidade");
		}
		return ResponseEntity.ok(dto);
	}

}
