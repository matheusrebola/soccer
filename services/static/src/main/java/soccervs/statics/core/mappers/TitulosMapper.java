package soccervs.statics.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import soccervs.statics.core.dtos.TituloCreateDTO;
import soccervs.statics.core.dtos.TituloDTO;
import soccervs.statics.core.entities.Titulos;

@Component
public class TitulosMapper {

	@Autowired
	private final ModelMapper mapper;

	public TitulosMapper(ModelMapper mapper) {this.mapper = mapper;}

	public Titulos map(TituloCreateDTO createDTO) {
		return mapper.map(createDTO, Titulos.class);
	}

	public TituloDTO map(Titulos saved) {
		return mapper.map(saved, TituloDTO.class);
	}
	

}
