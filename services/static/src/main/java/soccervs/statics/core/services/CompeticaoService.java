package soccervs.statics.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soccervs.statics.core.entities.Competicoes;
import soccervs.statics.core.repositories.CompeticaoRepository;

@Service
public class CompeticaoService {
	@Autowired
	private CompeticaoRepository repository;
	
	public Competicoes salvar(Competicoes c) {
		return repository.save(c);
	}
	
	public List<Competicoes> encontrarTodos() {
		return repository.findAll();
	}
}
