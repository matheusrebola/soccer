package soccervs.statics.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import soccervs.statics.core.dtos.JElencoCreateDTO;
import soccervs.statics.core.dtos.JElencoDTO;
import soccervs.statics.core.entities.JogadoresElenco;

@Component
public class JElencoMapper {

	@Autowired
	private ModelMapper mapper;

	public JogadoresElenco map(JElencoCreateDTO createDTO) {
		return mapper.map(createDTO, JogadoresElenco.class);
	}

	public JElencoDTO map(JogadoresElenco saved) {
		return mapper.map(saved, JElencoDTO.class);
	}

	public List<JElencoDTO> map(List<JogadoresElenco> j) {
		return j.stream()
				.map(jogadores -> mapper.map(j, JElencoDTO.class))
				.collect(Collectors.toList());
	}
}
