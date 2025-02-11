package soccervs.reciever.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import soccervs.reciever.core.documents.Cartoes;
import soccervs.reciever.core.dtos.CartoesCreateDTO;
import soccervs.reciever.core.dtos.CartoesDTO;

@Component
public class CartaoMapper {
	
	private final ModelMapper mapper;

	public CartaoMapper(ModelMapper mapper) {this.mapper = mapper;}

	public Cartoes map(CartoesCreateDTO createDTO) {return mapper.map(createDTO, Cartoes.class);}

	public CartoesDTO map(Cartoes saved) {return mapper.map(saved, CartoesDTO.class);}

}
