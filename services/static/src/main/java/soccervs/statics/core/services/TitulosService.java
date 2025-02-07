package soccervs.statics.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soccervs.statics.core.entities.Titulos;
import soccervs.statics.core.repositories.TituloRepository;

@Service
public class TitulosService {

	@Autowired
	private final TituloRepository repository;

	public TitulosService(TituloRepository repository) {this.repository = repository;}

	public Titulos salvar(Titulos titulo) {
		return repository.save(titulo);
	}

	public List<Titulos> encontrarTodos() {
		return repository.findAll();
	}
	
	
}
