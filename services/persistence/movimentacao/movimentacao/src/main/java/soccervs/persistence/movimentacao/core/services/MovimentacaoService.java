package soccervs.persistence.movimentacao.core.services;

import org.springframework.stereotype.Service;

import soccervs.persistence.movimentacao.core.entities.Movimentacao;
import soccervs.persistence.movimentacao.core.repositories.MovimentacaoRepository;

@Service
public class MovimentacaoService {

	private final MovimentacaoRepository repository;

	public MovimentacaoService(MovimentacaoRepository repository) {
		this.repository = repository;
	}
	
	public Movimentacao salvar(Movimentacao movimentacao) {
		return repository.save(movimentacao);
	}
}
