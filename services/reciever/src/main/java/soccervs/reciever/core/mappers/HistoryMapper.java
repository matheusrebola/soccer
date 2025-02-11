package soccervs.reciever.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import soccervs.reciever.core.documents.Event;
import soccervs.reciever.core.documents.History;

@Component
public class HistoryMapper {
	private final ModelMapper mapper;

	public HistoryMapper(ModelMapper mapper) {
		super();
		this.mapper = mapper;
	}
	
	public History map(Event event) {
		return mapper.map(event, History.class);
	}
}
