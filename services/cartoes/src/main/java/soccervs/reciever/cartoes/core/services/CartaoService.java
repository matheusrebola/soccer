package soccervs.reciever.cartoes.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import soccervs.reciever.cartoes.core.documents.Cartoes;
import soccervs.reciever.cartoes.core.repositories.CartoesRepository;

@Service
public class CartaoService {
	
	private final CartoesRepository repository;

	public CartaoService(CartoesRepository repository) {this.repository = repository;}

	public Cartoes salvar(Cartoes c) {
		return repository.save(c);
	}

	public List<Cartoes> encotrarTodos() {
		return repository.findAll();
	}

	
}
