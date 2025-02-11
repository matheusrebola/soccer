package soccervs.reciever.core.services;

import org.springframework.stereotype.Service;

import soccervs.reciever.core.documents.Movimentacao;
import soccervs.reciever.core.repositories.MovimentacaoRepository;

@Service
public class MovimentacaoService {

	private final MovimentacaoRepository repository;

	public MovimentacaoService(MovimentacaoRepository repository) {
		super();
		this.repository = repository;
	}

	public Movimentacao salvar(Movimentacao movimentacao) {
		return repository.save(movimentacao);
	}
}
