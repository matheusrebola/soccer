package soccervs.statics.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soccervs.statics.core.entities.Temporadas;
import soccervs.statics.core.repositories.TemporadaRepository;

@Service
public class TemporadaService {

	@Autowired
	private final TemporadaRepository repository;

	public TemporadaService(TemporadaRepository repository) {this.repository = repository;}

	public Temporadas salvar(Temporadas temporada) {
		return repository.save(temporada);
	}

	public List<Temporadas> encontrarTodos() {
		return repository.findAll();
	}
	
	
}
