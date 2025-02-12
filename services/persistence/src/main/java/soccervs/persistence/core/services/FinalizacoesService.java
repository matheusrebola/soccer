package soccervs.persistence.core.services;

import org.springframework.stereotype.Service;

import soccervs.persistence.core.entities.Finalizacoes;
import soccervs.persistence.core.repositories.FinalizacoesRepository;

@Service
public class FinalizacoesService {

	private final FinalizacoesRepository repository;

	public FinalizacoesService(FinalizacoesRepository repository) {
		this.repository = repository;
	}
	
	public Finalizacoes salvar(Finalizacoes finalizacoes) {
		return repository.save(finalizacoes);
	}
}
