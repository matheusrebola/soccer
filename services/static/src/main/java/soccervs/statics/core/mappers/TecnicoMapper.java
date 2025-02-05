package soccervs.statics.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import soccervs.statics.core.dtos.TecnicoCreateDTO;
import soccervs.statics.core.dtos.TecnicoDTO;
import soccervs.statics.core.entities.Tecnicos;

@Component
public class TecnicoMapper {

	@Autowired
	private ModelMapper mapper;

	public Tecnicos map(TecnicoCreateDTO createDTO) {
		return mapper.map(createDTO, Tecnicos.class);
	}

	public TecnicoDTO map(Tecnicos saved) {
		return mapper.map(saved, TecnicoDTO.class);
	}

	public List<TecnicoDTO> map(List<Tecnicos> t) {
		return t.stream()
				.map(tecnicos -> mapper.map(t, TecnicoDTO.class))
				.collect(Collectors.toList());
	}
	
	
}
