package soccervs.persistence.relacao.core.services;

import org.springframework.stereotype.Service;

import soccervs.persistence.relacao.core.entities.Relacoes;
import soccervs.persistence.relacao.core.repositories.RelacaoRepository;

@Service
public class RelacaoService {

	private final RelacaoRepository repository;

	public RelacaoService(RelacaoRepository repository) {
		this.repository = repository;
	}
	
	public Relacoes salvar(Relacoes jogadores) {
		return repository.save(jogadores);
	}
}
