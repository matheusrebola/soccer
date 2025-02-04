package soccervs.statics.core.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.statics.core.dtos.PosicaoCreateDTO;
import soccervs.statics.core.entities.Posicoes;
import soccervs.statics.core.mappers.PosicoesMapper;
import soccervs.statics.core.resources.exceptions.NotPersistedException;
import soccervs.statics.core.services.PosicoesService;

@RestController
@RequestMapping("/partidas")
public class PosicoesController {

	@Autowired
	private PosicoesMapper mapper;
	
	@Autowired
	private PosicoesService service;
	
	@PostMapping
	public void cadastrarPosicao(@RequestBody PosicaoCreateDTO createDTO) {
		Posicoes posicao = mapper.map(createDTO);
		Posicoes saved = service.save(posicao);
		
		if (saved == null) {
			throw new NotPersistedException("Posicao não persistida");
		}
		
		Byte id = service.pegarId(posicao);
	}
	
}
