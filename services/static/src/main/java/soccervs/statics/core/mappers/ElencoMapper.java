package soccervs.statics.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import soccervs.statics.core.dtos.ElencoCreateDTO;
import soccervs.statics.core.entities.Elencos;

@Component
public class ElencoMapper {
	@Autowired
	private ModelMapper mapper;
	
	public Elencos map(ElencoCreateDTO dto) {
		Elencos e = mapper.map(dto, Elencos.class);
		return e;
	}
}
