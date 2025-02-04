package soccervs.statics.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import soccervs.statics.core.dtos.PosicaoCreateDTO;
import soccervs.statics.core.dtos.PosicaoDTO;
import soccervs.statics.core.entities.Posicoes;

@Component
public class PosicoesMapper {

	@Autowired
	private ModelMapper mapper;

	public Posicoes map(PosicaoCreateDTO createDTO) {
		Posicoes p = mapper.map(createDTO, Posicoes.class);
		return p;
	}

	public PosicaoDTO map(Posicoes saved) {
		PosicaoDTO dto = mapper.map(saved, PosicaoDTO.class);
		return dto;
	}
}
