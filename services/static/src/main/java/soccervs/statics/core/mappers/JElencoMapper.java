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
		JogadoresElenco j = mapper.map(createDTO, JogadoresElenco.class);
		return j;
	}

	public JElencoDTO map(JogadoresElenco saved) {
		JElencoDTO dto = mapper.map(saved, JElencoDTO.class);
		return dto;
	}

	public List<JElencoDTO> map(List<JogadoresElenco> j) {
		return j.stream()
				.map(jogadores -> mapper.map(j, JElencoDTO.class))
				.collect(Collectors.toList());
	}
}
