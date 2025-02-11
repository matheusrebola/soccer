package soccervs.reciever.core.services;

import org.springframework.stereotype.Service;

import soccervs.reciever.core.documents.PassesDetalhes;
import soccervs.reciever.core.repositories.PassesDetalhesRepository;

@Service
public class PassesDetalhesService {

	private final PassesDetalhesRepository repository;

	public PassesDetalhesService(PassesDetalhesRepository repository) {
		super();
		this.repository = repository;
	}

	public PassesDetalhes salvar(PassesDetalhes passesDetalhes) {
		return repository.save(passesDetalhes);
	}
	
	
}
