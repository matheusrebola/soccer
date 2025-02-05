package soccervs.statics.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import soccervs.statics.core.dtos.ClubeCreateDTO;
import soccervs.statics.core.dtos.ClubeDTO;
import soccervs.statics.core.entities.Clubes;

@Component
public class ClubeMapper {
	@Autowired
	private ModelMapper mapper;
	
	public Clubes map(ClubeCreateDTO dto) { 
		return mapper.map(dto, Clubes.class);
	}
	
	public Clubes map(ClubeDTO dto) {
		return mapper.map(dto, Clubes.class);
	}
	
	public ClubeDTO map(Clubes c) {
		return mapper.map(c, ClubeDTO.class);
	}
	
	public List<ClubeDTO> map(List<Clubes> c) {
		return c.stream()
                .map(clube -> mapper.map(clube, ClubeDTO.class))
                .collect(Collectors.toList());
	}
	
}
