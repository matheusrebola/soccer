package soccervs.persistence.core.services;

import org.springframework.stereotype.Service;

import soccervs.persistence.core.entities.Faltas;
import soccervs.persistence.core.repositories.FaltasRepository;

@Service
public class FaltasService {

	private final FaltasRepository repository;

	public FaltasService(FaltasRepository repository) {
		this.repository = repository;
	}

	public Faltas salvar(Faltas faltas) {
		return repository.save(faltas);
	}
}
