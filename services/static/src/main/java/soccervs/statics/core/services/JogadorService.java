package soccervs.statics.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soccervs.statics.core.entities.Jogadores;
import soccervs.statics.core.repositories.JogadorRepository;

@Service
public class JogadorService {

	@Autowired
	private JogadorRepository repository;

	public Jogadores salvar(Jogadores j) {
		return repository.save(j);
	}
}
