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
	private final ModelMapper mapper;

	public PosicoesMapper(ModelMapper mapper) {
		super();
		this.mapper = mapper;
	}

	public Posicoes map(PosicaoCreateDTO createDTO) {
		return mapper.map(createDTO, Posicoes.class);
	}

	public PosicaoDTO map(Posicoes saved) {
		return mapper.map(saved, PosicaoDTO.class);
	}

	public List<PosicaoDTO> map(List<Posicoes> p) {
		return p.stream()
				.map(posicoes -> mapper.map(posicoes, PosicaoDTO.class))
				.collect(Collectors.toList());
	}
}
