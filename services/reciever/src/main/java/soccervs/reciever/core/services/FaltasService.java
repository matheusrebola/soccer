package soccervs.reciever.core.services;

import org.springframework.stereotype.Service;

import soccervs.reciever.core.documents.Faltas;
import soccervs.reciever.core.repositories.FaltasRepository;

@Service
public class FaltasService {

	private final FaltasRepository repository;

	public FaltasService(FaltasRepository repository) {this.repository = repository;}

	public Faltas salvar(Faltas falta) {
		return repository.save(falta);
	}
	
	
}
