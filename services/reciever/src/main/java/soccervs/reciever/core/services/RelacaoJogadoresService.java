package soccervs.reciever.core.services;

import org.springframework.stereotype.Service;

import soccervs.reciever.core.documents.RelacaoJogadores;
import soccervs.reciever.core.repositories.RelacaoJogadoresRepository;

@Service
public class RelacaoJogadoresService {

	private final RelacaoJogadoresRepository repository;

	public RelacaoJogadoresService(RelacaoJogadoresRepository repository) {
		super();
		this.repository = repository;
	}

	public RelacaoJogadores salvar(RelacaoJogadores relacao) {
		return repository.save(relacao);
	}

}
