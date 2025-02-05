package soccervs.statics.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import soccervs.statics.core.dtos.TecnicoCreateDTO;
import soccervs.statics.core.entities.Tecnicos;

@Component
public class TecnicoMapper {

	@Autowired
	private ModelMapper mapper;

	public Tecnicos map(TecnicoCreateDTO createDTO) {
		Tecnicos t = mapper.map(createDTO, Tecnicos.class);
		return t;
	}
	
	
}
