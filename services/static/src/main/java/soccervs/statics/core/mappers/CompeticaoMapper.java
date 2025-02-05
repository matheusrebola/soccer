package soccervs.statics.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import soccervs.statics.core.dtos.CompeticaoCreateDTO;
import soccervs.statics.core.dtos.CompeticaoDTO;
import soccervs.statics.core.entities.Competicoes;

@Component
public class CompeticaoMapper {

	@Autowired
	private ModelMapper mapper;
	
	public Competicoes map(CompeticaoCreateDTO dto) {
		return mapper.map(dto, Competicoes.class);
	}
	
	public CompeticaoDTO map(Competicoes c) {
		return mapper.map(c, CompeticaoDTO.class);
	}
	
	public List<CompeticaoDTO> map(List<Competicoes> c) {
		return c.stream()
				.map(competicoes -> mapper.map(c, CompeticaoDTO.class))
				.collect(Collectors.toList());
	}
}
