package soccervs.persistence.core.services;

import org.springframework.stereotype.Service;

import soccervs.persistence.core.entities.RelacaoJogadores;
import soccervs.persistence.core.repositories.RelacaoJogadoresRepository;

@Service
public class RelacaoJogadoresService {

	private final RelacaoJogadoresRepository repository;

	public RelacaoJogadoresService(RelacaoJogadoresRepository repository) {
		this.repository = repository;
	}
	
	public RelacaoJogadores salvar(RelacaoJogadores jogadores) {
		return repository.save(jogadores);
	}
}
