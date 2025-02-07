package soccervs.statics.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soccervs.statics.core.repositories.TituloRepository;

@Service
public class TitulosService {

	@Autowired
	private final TituloRepository repository;

	public TitulosService(TituloRepository repository) {this.repository = repository;}
	
	
}
