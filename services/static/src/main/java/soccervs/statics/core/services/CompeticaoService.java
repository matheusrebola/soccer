package soccervs.statics.core.services;

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
	
	public Short encotrarId(Competicoes c) {
		return repository.findId(c);
	}
}
