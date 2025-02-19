package soccervs.statics.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soccervs.statics.core.dtos.ClubeDTO;
import soccervs.statics.core.entities.Clubes;
import soccervs.statics.core.repositories.ClubeRepository;

@Service
public class ClubeService {
	@Autowired
	private final ClubeRepository repository;
	
	public ClubeService(ClubeRepository repository) {this.repository = repository;}

	public Clubes salvar(Clubes clube) {
		return repository.save(clube);
	}

	public List<Clubes> encontrarTodos() {
		return repository.findAll();
	}
	
	public Clubes encontrarPorNome(String n) {
		return repository.findByNome(n).orElse(null);
	}
	
	public ClubeDTO findByCidade(String c) {
		return repository.findByCidade(c);
	}
	
	public ClubeDTO findByPais(String p) {
		return repository.findByPais(p);
	}
	
}
