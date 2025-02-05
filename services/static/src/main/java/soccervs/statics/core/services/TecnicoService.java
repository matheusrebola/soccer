package soccervs.statics.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soccervs.statics.core.entities.Tecnicos;
import soccervs.statics.core.repositories.TecnicoRepository;

@Service
public class TecnicoService {

	@Autowired
	private TecnicoRepository repository;

	public Tecnicos salvar(Tecnicos t) {
		return repository.save(t);
	}

	public Integer pegarId(Tecnicos t) {
		return repository.findIdByTecnico(t);
	}

	public List<Tecnicos> encontrarTodos() {
		return repository.findAll();
	}
}
