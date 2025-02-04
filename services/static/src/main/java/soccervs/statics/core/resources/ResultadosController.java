package soccervs.statics.core.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	public void cadastrarResultado() {
		
	}
	
}
