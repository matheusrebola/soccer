package soccervs.statics.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import soccervs.statics.core.dtos.JogadorCreateDTO;
import soccervs.statics.core.dtos.JogadorDTO;
import soccervs.statics.core.entities.Jogadores;

@Component
public class JogadorMapper {

	@Autowired
	private ModelMapper mapper;

	public Jogadores map(JogadorCreateDTO dto) {
		Jogadores j = mapper.map(dto, Jogadores.class);
		return j;
	}

	public JogadorDTO map(Jogadores j) {
		JogadorDTO dto = mapper.map(j, JogadorDTO.class);
		return dto;
	}

	public List<JogadorDTO> map(List<Jogadores> j) {
		return j.stream()
				.map(jogadores -> mapper.map(j, JogadorDTO.class))
				.collect(Collectors.toList());
	}
	
	
}
