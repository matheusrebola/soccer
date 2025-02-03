package soccervs.statics.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import soccervs.statics.core.dtos.ClubeCreateDTO;
import soccervs.statics.core.entities.Clubes;

@Component
public class ClubeMapper {
	@Autowired
	private ModelMapper mapper;
	
	public Clubes map(ClubeCreateDTO dto) {
		Clubes c = mapper.map(dto, Clubes.class);
		return c;
	}
}
