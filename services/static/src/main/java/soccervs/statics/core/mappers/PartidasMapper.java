package soccervs.statics.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import soccervs.statics.core.dtos.PartidaCreateDTO;
import soccervs.statics.core.dtos.PartidaDTO;
import soccervs.statics.core.entities.Partidas;

@Component
public class PartidasMapper {

	@Autowired
	private ModelMapper mapper;

	public Partidas map(PartidaCreateDTO createDTO) {
		Partidas p = mapper.map(createDTO, Partidas.class);
		return p;
	}

	public PartidaDTO map(Partidas saved) {
		PartidaDTO dto = mapper.map(saved, PartidaDTO.class);
		return dto;
	}

	public List<PartidaDTO> map(List<Partidas> p) {
		return p.stream()
				.map(partidas -> mapper.map(p, PartidaDTO.class))
				.collect(Collectors.toList());
	}
}
