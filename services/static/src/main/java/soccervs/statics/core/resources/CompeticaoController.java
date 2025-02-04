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

import soccervs.statics.core.dtos.CompeticaoCreateDTO;
import soccervs.statics.core.dtos.CompeticaoDTO;
import soccervs.statics.core.entities.Competicoes;
import soccervs.statics.core.mappers.CompeticaoMapper;
import soccervs.statics.core.resources.exceptions.NotFoundedException;
import soccervs.statics.core.resources.exceptions.NotPersistedException;
import soccervs.statics.core.services.CompeticaoService;

@RestController
@RequestMapping("/competicoes")
public class CompeticaoController {
	
	@Autowired
	private CompeticaoMapper mapper;
	
	@Autowired
	private CompeticaoService service;
	
	@PostMapping
	public ResponseEntity<CompeticaoDTO> criarCompeticao(@RequestBody CompeticaoCreateDTO createDTO) {
		Competicoes competicao = mapper.map(createDTO);
		Competicoes saved = service.salvar(competicao);
		
		if(saved == null) {
			throw new NotPersistedException("Competicao não persistida");
		}
		
		Short id = service.encotrarId(competicao);
		URI location = URI.create("/competicoes/" + id);
		CompeticaoDTO dto = mapper.map(saved);
		return ResponseEntity.created(location).body(dto);
	}
	
	@GetMapping
	public ResponseEntity<List<CompeticaoDTO>> encontrarTodos() {
		List<Competicoes> competicao = service.encontrarTodos();
		if (competicao.isEmpty()) {
			throw new NotFoundedException("Competicoes não encontradas");
		}
		List<CompeticaoDTO> dto = mapper.map(competicao);
		return ResponseEntity.ok(dto);
	}
}
