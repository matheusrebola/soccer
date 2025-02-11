package soccervs.reciever.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import soccervs.reciever.core.documents.Event;
import soccervs.reciever.core.dtos.EventCreateDTO;

@Component
public class EventMapper {

	private final ModelMapper mapper;

	public EventMapper(ModelMapper mapper) {
		super();
		this.mapper = mapper;
	}

	public Event map(EventCreateDTO dto) {
		return mapper.map(dto, Event.class);
	}
}
