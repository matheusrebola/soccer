package soccervs.statics.core.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.statics.core.dtos.TecnicoCreateDTO;
import soccervs.statics.core.entities.Tecnicos;
import soccervs.statics.core.mappers.TecnicoMapper;
import soccervs.statics.core.services.TecnicoService;

@RestController
@RequestMapping("/tecnicos")
public class TecnicosController {

	@Autowired
	private TecnicoMapper mapper;
	
	@Autowired
	private TecnicoService service;
	
	@PostMapping
	public void cadastrarTecnico(@RequestBody TecnicoCreateDTO createDTO) {
		Tecnicos tecnico = mapper.map(createDTO);
	}
	
}
