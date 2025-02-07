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

import soccervs.statics.core.dtos.JElencoCreateDTO;
import soccervs.statics.core.dtos.JElencoDTO;
import soccervs.statics.core.entities.JogadoresElenco;
import soccervs.statics.core.mappers.JElencoMapper;
import soccervs.statics.core.resources.exceptions.NotFoundedException;
import soccervs.statics.core.resources.exceptions.NotPersistedException;
import soccervs.statics.core.services.JElencoService;



@RestController
@RequestMapping("/jogadores-elenco")
public class JogadoresElencoController {
	
	@Autowired
	private final JElencoMapper mapper;
	
	@Autowired
	private final JElencoService service;
	
	public JogadoresElencoController(JElencoMapper mapper, JElencoService service) {super();this.mapper = mapper;this.service = service;}

	@PostMapping
	public ResponseEntity<JElencoDTO> cadastrarJogador(@RequestBody JElencoCreateDTO createDTO) {
		JogadoresElenco jElenco = mapper.map(createDTO);
		JogadoresElenco saved = service.salvar(jElenco);
		
		if (saved == null) {
			throw new NotPersistedException("Jogador do Elenco não persistido");
		}
		Long id = saved.getId();
		URI location = URI.create("/jogadores-elenco/"+id);
		JElencoDTO dto = mapper.map(saved);
		
		return ResponseEntity.created(location).body(dto);
	}
	
	@GetMapping
	public ResponseEntity<List<JElencoDTO>> encontrarTodos() {
		List<JogadoresElenco> jogadores = service.encontrarTodos();
		
		if (jogadores.isEmpty()) {
			throw new NotFoundedException("Jogadores no elenco não encontradas");
		}
		
		List<JElencoDTO> dto = mapper.map(jogadores);
		return ResponseEntity.ok(dto);
	}
	
}
