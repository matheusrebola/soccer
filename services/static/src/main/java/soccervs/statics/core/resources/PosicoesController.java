package soccervs.statics.core.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.statics.core.mappers.PosicoesMapper;

@RestController
@RequestMapping("/partidas")
public class PosicoesController {

	@Autowired
	private PosicoesMapper mapper;
	
	@Autowired
	private PosicoesService service;
	
}
