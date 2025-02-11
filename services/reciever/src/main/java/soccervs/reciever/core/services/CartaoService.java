package soccervs.reciever.core.services;

import org.springframework.stereotype.Service;

import soccervs.reciever.core.documents.Cartoes;
import soccervs.reciever.core.repositories.CartoesRepository;

@Service
public class CartaoService {
	
	private final CartoesRepository repository;

	public CartaoService(CartoesRepository repository) {this.repository = repository;}

	public Cartoes salvar(Cartoes c) {
		return repository.save(c);
	}

}
