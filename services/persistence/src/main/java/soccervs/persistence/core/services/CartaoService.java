package soccervs.persistence.core.services;

import org.springframework.stereotype.Service;

import soccervs.persistence.core.entities.Cartoes;
import soccervs.persistence.core.repositories.CartoesRepository;

@Service
public class CartaoService {

	private final CartoesRepository repository;

	public CartaoService(CartoesRepository repository) {
		this.repository = repository;
	}
	
	public Cartoes salvar(Cartoes cartao) {
		return repository.save(cartao);
	}
}
