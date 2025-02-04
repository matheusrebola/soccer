package soccervs.statics.core.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.statics.core.mappers.PartidasMapper;

@RestController
@RequestMapping("/partidas")
public class PartidasController {

	@Autowired
	private PartidasMapper mapper;

	@Autowired
	private PartidasService service;
}
