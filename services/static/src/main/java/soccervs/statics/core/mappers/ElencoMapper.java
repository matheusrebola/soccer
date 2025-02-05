package soccervs.statics.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import soccervs.statics.core.dtos.ElencoCreateDTO;
import soccervs.statics.core.dtos.ElencoDTO;
import soccervs.statics.core.entities.Elencos;

@Component
public class ElencoMapper {
	@Autowired
	private ModelMapper mapper;
	
	public Elencos map(ElencoCreateDTO dto) {
		return mapper.map(dto, Elencos.class);
	}
	
	public ElencoDTO map(Elencos e) {
		return mapper.map(e, ElencoDTO.class);
	}
	
	public List<ElencoDTO> map(List<Elencos> e) {
		return e.stream()
				.map(elencos -> mapper.map(e, ElencoDTO.class))
				.collect(Collectors.toList());
	}
}
