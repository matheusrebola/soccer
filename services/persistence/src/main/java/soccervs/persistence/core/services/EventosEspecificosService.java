package soccervs.persistence.core.services;

import org.springframework.stereotype.Service;

import soccervs.persistence.core.entities.EventosEspecificos;
import soccervs.persistence.core.repositories.EventosEspecificosRepository;

@Service
public class EventosEspecificosService {

	private final EventosEspecificosRepository repository;

	public EventosEspecificosService(EventosEspecificosRepository repository) {
		this.repository = repository;
	}
	
	public EventosEspecificos salvar(EventosEspecificos especificos) {
		return repository.save(especificos);
	}
}
