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

import soccervs.statics.core.dtos.PosicaoCreateDTO;
import soccervs.statics.core.dtos.PosicaoDTO;
import soccervs.statics.core.entities.Posicoes;
import soccervs.statics.core.mappers.PosicoesMapper;
import soccervs.statics.core.resources.exceptions.NotFoundedException;
import soccervs.statics.core.resources.exceptions.NotPersistedException;
import soccervs.statics.core.services.PosicoesService;

@RestController
@RequestMapping("/posicoes")
public class PosicoesController {

	@Autowired
	private PosicoesMapper mapper;
	
	@Autowired
	private PosicoesService service;
	
	@PostMapping
	public ResponseEntity<PosicaoDTO> cadastrarPosicao(@RequestBody PosicaoCreateDTO createDTO) {
		Posicoes posicao = mapper.map(createDTO);
		Posicoes saved = service.save(posicao);
		
		if (saved == null) {
			throw new NotPersistedException("Posicao não persistida");
		}
		
		Long id = saved.getId();
		URI location = URI.create("/posicoes/"+id);
		PosicaoDTO dto = mapper.map(saved);
		
		return ResponseEntity.created(location).body(dto);
	}
	
	@GetMapping
	public ResponseEntity<List<PosicaoDTO>> encontrarTodos() {
		List<Posicoes> posicoes = service.encontrarTodos();
		
		if (posicoes.isEmpty()) {
			throw new NotFoundedException("Posicoes não encontradas");
		}
		
		List<PosicaoDTO> dto = mapper.map(posicoes);
		return ResponseEntity.ok(dto);
	}
	
}
