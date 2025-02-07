package soccervs.statics.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

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

	public List<TituloDTO> map(List<Titulos> t) {
		return t.stream()
				.map(titulo -> mapper.map(titulo, TituloDTO.class))
				.collect(Collectors.toList());
	}
	

}
