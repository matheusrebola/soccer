package soccervs.reciever.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import soccervs.reciever.core.documents.Finalizacoes;
import soccervs.reciever.core.repositories.FinalizacoesRepository;

@Service
public class FinalizacoesService {

	private final FinalizacoesRepository repository;

	public FinalizacoesService(FinalizacoesRepository repository) {this.repository = repository;}

	public Finalizacoes salvar(Finalizacoes finalizacoes) {
		return repository.save(finalizacoes);
	}

	public List<Finalizacoes> encontrarTodos() {
		return repository.findAll();
	}
	
	
}
