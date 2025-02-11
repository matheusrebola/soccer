package soccervs.reciever.core.services;

import org.springframework.stereotype.Service;

import soccervs.reciever.core.documents.LinhaDefensiva;
import soccervs.reciever.core.repositories.LinhaDefensivaRepository;

@Service
public class LinhaDefensivaService {

	private final LinhaDefensivaRepository repository;

	public LinhaDefensivaService(LinhaDefensivaRepository repository) {this.repository = repository;}

	public LinhaDefensiva salvar(LinhaDefensiva linhaDefensiva) {
		return repository.save(linhaDefensiva);
	}
	
	
}
