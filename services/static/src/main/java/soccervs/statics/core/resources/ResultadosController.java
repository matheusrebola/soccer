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

import soccervs.statics.core.dtos.ResultadoCreateDTO;
import soccervs.statics.core.dtos.ResultadoDTO;
import soccervs.statics.core.entities.Resultados;
import soccervs.statics.core.mappers.ResultadosMapper;
import soccervs.statics.core.resources.exceptions.NotFoundedException;
import soccervs.statics.core.resources.exceptions.NotPersistedException;
import soccervs.statics.core.services.ResultadosService;

@RestController
@RequestMapping("/resultados")
public class ResultadosController {

	@Autowired
	private final ResultadosMapper mapper;
	
	@Autowired
	private final ResultadosService service;
		
	public ResultadosController(ResultadosMapper mapper, ResultadosService service) {
		super();
		this.mapper = mapper;
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<ResultadoDTO> cadastrarResultado(@RequestBody ResultadoCreateDTO createDTO) {
		Resultados resultado = mapper.map(createDTO);
		Resultados saved = service.salvar(resultado);
		
		if (saved == null) {
			throw new NotPersistedException("Resultado não persistido");
		}
		
		Long id = saved.getId();
		URI location = URI.create("/resultados/"+id);
		ResultadoDTO dto = mapper.map(saved);
		
		return ResponseEntity.created(location).body(dto);
	}
	
	@GetMapping
	public ResponseEntity<List<ResultadoDTO>> encontrarTodos() {
		List<Resultados> resultados = service.encontrarTodos();
		
		if (resultados.isEmpty()) {
			throw new NotFoundedException("Posicoes não encontradas");
		}
		
		List<ResultadoDTO> dto = mapper.map(resultados);
		return ResponseEntity.ok(dto);
	}
	
}
