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
		Clubes c = mapper.map(dto, Clubes.class);
		return c;
	}
	
	public Clubes map(ClubeDTO dto) {
		Clubes c = mapper.map(dto, Clubes.class);
		return c;
	}
	
	public ClubeDTO map(Clubes c) {
		ClubeDTO dto = mapper.map(c, ClubeDTO.class);
		return dto;
	}
	
	public List<ClubeDTO> map(List<Clubes> c) {
		return c.stream()
                .map(clube -> mapper.map(clube, ClubeDTO.class))
                .collect(Collectors.toList());
	}
	
}
