package soccervs.persistence.core.services;

import org.springframework.stereotype.Service;

import soccervs.persistence.core.entities.LinhaDefensiva;
import soccervs.persistence.core.repositories.LinhaDefensivaRepository;

@Service
public class LinhaDefensivaService {

	private final LinhaDefensivaRepository repository;

	public LinhaDefensivaService(LinhaDefensivaRepository repository) {
		this.repository = repository;
	}
	
	public LinhaDefensiva salvar(LinhaDefensiva defensiva) {
		return repository.save(defensiva);
	}
}
