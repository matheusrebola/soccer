package soccervs.statics.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soccervs.statics.core.entities.Tecnicos;
import soccervs.statics.core.repositories.TecnicoRepository;

@Service
public class TecnicoService {

	@Autowired
	private final TecnicoRepository repository;

	public TecnicoService(TecnicoRepository repository) {this.repository = repository;}

	public Tecnicos salvar(Tecnicos t) {
		return repository.save(t);
	}

	public List<Tecnicos> encontrarTodos() {
		return repository.findAll();
	}
}
