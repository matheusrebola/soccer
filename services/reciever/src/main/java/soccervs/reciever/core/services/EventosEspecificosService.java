package soccervs.reciever.core.services;

import org.springframework.stereotype.Service;

import soccervs.reciever.core.documents.EventosEspecificos;
import soccervs.reciever.core.repositories.EventosEspecificosRepository;

@Service
public class EventosEspecificosService {
	
	private final EventosEspecificosRepository repository;
	
	public EventosEspecificosService(EventosEspecificosRepository repository) {
		super();
		this.repository = repository;
	}

	public EventosEspecificos salvar(EventosEspecificos evento) {
		return repository.save(evento);
	}

}
