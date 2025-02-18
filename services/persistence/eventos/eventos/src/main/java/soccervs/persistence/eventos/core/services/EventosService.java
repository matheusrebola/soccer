package soccervs.persistence.eventos.core.services;

import org.springframework.stereotype.Service;

import soccervs.persistence.eventos.core.entities.Eventos;
import soccervs.persistence.eventos.core.repositories.EventosRepository;

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
