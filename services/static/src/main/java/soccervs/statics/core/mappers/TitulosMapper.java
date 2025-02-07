package soccervs.statics.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TitulosMapper {

	@Autowired
	private final ModelMapper mapper;

	public TitulosMapper(ModelMapper mapper) {this.mapper = mapper;}
	

}
