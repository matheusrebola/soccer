package soccervs.statics.core.resources;

import java.net.URI;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	private final ClubeMapper mapper;

	@Autowired
	private final ClubeService service;
	
	public ClubeController(ClubeMapper mapper, ClubeService service) {this.mapper = mapper;this.service = service;}

	@PostMapping
	public ResponseEntity<ClubeDTO> cadastrarClube(@RequestBody ClubeCreateDTO createDTO) {
		Clubes clube = mapper.map(createDTO);
		Clubes clubeSaved = service.salvar(clube);

		if (clubeSaved == null) {
			throw new NotPersistedException("Clube não persistido");
		}

		Long id = clubeSaved.getId();
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
	
	@GetMapping("/{nome}")
	public ResponseEntity<ClubeDTO> encontrarPelaCidade(@PathVariable String nome) {
		System.out.println("Recebido: " + nome);
		String decodedNome = URLDecoder.decode(nome, StandardCharsets.UTF_8);
		Clubes c = service.encontrarPorNome(decodedNome);
		if (c == null) {
			throw new NotFoundedException("Clube não encontrado");
		}
		ClubeDTO dto = mapper.map(c);
		return ResponseEntity.ok(dto);
	}

}
