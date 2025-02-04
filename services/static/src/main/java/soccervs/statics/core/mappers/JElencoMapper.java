package soccervs.statics.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import soccervs.statics.core.dtos.JElencoCreateDTO;
import soccervs.statics.core.entities.JogadoresElenco;

@Component
public class JElencoMapper {

	@Autowired
	private ModelMapper mapper;

	public JogadoresElenco map(JElencoCreateDTO createDTO) {
		JogadoresElenco j = mapper.map(createDTO, JogadoresElenco.class);
		return j;
	}
}
