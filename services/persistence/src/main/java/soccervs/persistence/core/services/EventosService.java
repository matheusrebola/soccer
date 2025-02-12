package soccervs.persistence.core.services;

import org.springframework.stereotype.Service;

import soccervs.persistence.core.entities.Eventos;
import soccervs.persistence.core.repositories.EventosRepository;

@Service
public class EventosService {

	private final EventosRepository repository;

	public EventosService(EventosRepository repository) {
		this.repository = repository;
	}
	
	public Eventos salvar(Eventos eventos) {
		return repository.save(eventos);
	}
}
