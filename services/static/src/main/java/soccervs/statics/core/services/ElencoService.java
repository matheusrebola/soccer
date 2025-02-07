package soccervs.statics.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soccervs.statics.core.entities.Elencos;
import soccervs.statics.core.repositories.ElencoRepository;

@Service
public class ElencoService {
	
	@Autowired
	private final ElencoRepository repository;
		
	public ElencoService(ElencoRepository repository) {this.repository = repository;}

	public Elencos salvar(Elencos e) {
		return repository.save(e);
	}

	public List<Elencos> encontrarTodos() {
		return repository.findAll();
	}
}
