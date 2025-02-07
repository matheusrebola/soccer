package soccervs.statics.core.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.statics.core.mappers.TitulosMapper;
import soccervs.statics.core.services.TitulosService;

@RestController
@RequestMapping("/titulos")
public class TitulosController {

	@Autowired
	private final TitulosMapper mapper;
	
	@Autowired
	private final TitulosService service;

	public TitulosController(TitulosMapper mapper, TitulosService service) {
		this.mapper = mapper;
		this.service = service;
	}
	
	
}
