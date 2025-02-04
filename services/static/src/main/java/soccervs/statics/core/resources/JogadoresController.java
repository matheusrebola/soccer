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

import soccervs.statics.core.dtos.JogadorCreateDTO;
import soccervs.statics.core.dtos.JogadorDTO;
import soccervs.statics.core.entities.Jogadores;
import soccervs.statics.core.mappers.JogadorMapper;
import soccervs.statics.core.resources.exceptions.NotFoundedException;
import soccervs.statics.core.resources.exceptions.NotPersistedException;
import soccervs.statics.core.services.JogadorService;

@RestController
@RequestMapping("/jogadores")
public class JogadoresController {
	
	@Autowired
	private JogadorMapper mapper;
	
	@Autowired
	private JogadorService service;
	
	@PostMapping
	public ResponseEntity<JogadorDTO> cadastrarJogador(@RequestBody JogadorCreateDTO createDTO) {
		Jogadores jogador = mapper.map(createDTO);
		Jogadores saved = service.salvar(jogador);
		
		if(saved == null) {
			throw new NotPersistedException("Jogador não persistido");
		}
		Long id = service.pegarId(jogador);
		URI location = URI.create("/jogadores/"+id);
		JogadorDTO dto = mapper.map(saved);
		return ResponseEntity.created(location).body(dto);
		
	}
	
	@GetMapping
	public ResponseEntity<List<JogadorDTO>> encontrarTodos() {
		List<Jogadores> jogador = service.encontrarTodos();
		
		if (jogador.isEmpty()) {
			throw new NotFoundedException("Competicoes não encontradas");
		}
		
		List<JogadorDTO> dto = mapper.map(jogador);
		return ResponseEntity.ok(dto);
	}
}
