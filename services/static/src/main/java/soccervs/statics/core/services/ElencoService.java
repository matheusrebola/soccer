package soccervs.statics.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soccervs.statics.core.entities.Elencos;
import soccervs.statics.core.repositories.ElencoRepository;

@Service
public class ElencoService {
	
	@Autowired
	private ElencoRepository repository;
	
	public Elencos salvar(Elencos e) {
		return repository.save(e);
	}
}
