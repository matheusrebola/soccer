package soccervs.statics.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

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

	public List<PosicaoDTO> map(List<Posicoes> p) {
		return p.stream()
				.map(posicoes -> mapper.map(p, PosicaoDTO.class))
				.collect(Collectors.toList());
	}
}
