package soccervs.statics.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soccervs.statics.core.entities.Jogadores;
import soccervs.statics.core.repositories.JogadorRepository;

@Service
public class JogadorService {

	@Autowired
	private final JogadorRepository repository;
	
	public JogadorService(JogadorRepository repository) {this.repository = repository;}

	public Jogadores salvar(Jogadores j) {
		return repository.save(j);
	}

	public List<Jogadores> encontrarTodos() {
		return repository.findAll();
	}
}
