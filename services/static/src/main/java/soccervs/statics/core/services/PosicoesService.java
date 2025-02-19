package soccervs.statics.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soccervs.statics.core.entities.Posicoes;
import soccervs.statics.core.repositories.PosicaoRepository;

@Service
public class PosicoesService {

	@Autowired
	private final PosicaoRepository repository;
	
	public PosicoesService(PosicaoRepository repository) {this.repository = repository;}

	public Posicoes save(Posicoes posicao) {
		return repository.save(posicao);
	}

	public List<Posicoes> encontrarTodos() {
		return repository.findAll();
	}
}
