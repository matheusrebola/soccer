package soccervs.statics.core.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.statics.core.dtos.ResultadoCreateDTO;
import soccervs.statics.core.entities.Resultados;
import soccervs.statics.core.mappers.ResultadosMapper;
import soccervs.statics.core.services.ResultadosService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/resultados")
public class ResultadosController {

	@Autowired
	private ResultadosMapper mapper;
	
	private ResultadosService service;
	
	@PostMapping
	public void cadastrarResultado(@RequestBody ResultadoCreateDTO createDTO) {
		Resultados resultado = mapper.map(createDTO);
	}
	
}
