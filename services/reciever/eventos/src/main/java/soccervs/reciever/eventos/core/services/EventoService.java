package soccervs.reciever.eventos.core.services;

import org.springframework.stereotype.Service;

import soccervs.reciever.eventos.core.producer.EventosProducer;
import soccervs.reciever.eventos.core.utils.JsonUtil;

@Service
public class EventoService {
	private final EventService eventService;
	private final EventosProducer producer;
	private final JsonUtil jsonUtil;

	public EventoService(EventService eventService, EventosProducer producer,
			JsonUtil jsonUtil) {
		super();
		this.eventService = eventService;
		this.producer = producer;
		this.jsonUtil = jsonUtil;
	}
	
	

}
