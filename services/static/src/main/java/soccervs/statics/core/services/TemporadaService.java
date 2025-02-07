package soccervs.statics.core.services;

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
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
