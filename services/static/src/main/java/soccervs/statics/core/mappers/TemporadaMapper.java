package soccervs.statics.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import soccervs.statics.core.dtos.TemporadaCreateDTO;
import soccervs.statics.core.dtos.TemporadaDTO;
import soccervs.statics.core.entities.Temporadas;

@Component
public class TemporadaMapper {
	
	@Autowired
	private final ModelMapper mapper;

	public TemporadaMapper(ModelMapper mapper) {this.mapper = mapper;}

	public Temporadas map(TemporadaCreateDTO createDTO) {
		return mapper.map(createDTO, Temporadas.class);
	}

	public TemporadaDTO map(Temporadas saved) {
		return mapper.map(saved, TemporadaDTO.class);
	}
	
	
}
