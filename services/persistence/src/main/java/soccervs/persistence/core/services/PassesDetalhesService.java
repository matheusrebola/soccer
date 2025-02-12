package soccervs.persistence.core.services;

import org.springframework.stereotype.Service;

import soccervs.persistence.core.entities.PassesDetalhes;
import soccervs.persistence.core.repositories.PassesDetalhesRepository;

@Service
public class PassesDetalhesService {

	private final PassesDetalhesRepository repository;

	public PassesDetalhesService(PassesDetalhesRepository repository) {
		this.repository = repository;
	}
	
	public PassesDetalhes salvar(PassesDetalhes passesDetalhes) {
		return repository.save(passesDetalhes);
	}
}
