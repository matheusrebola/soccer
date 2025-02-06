package soccervs.statics.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soccervs.statics.core.entities.JogadoresElenco;
import soccervs.statics.core.repositories.JogadorElencoRepository;

@Service
public class JElencoService {

	@Autowired
	private JogadorElencoRepository repository;

	public JogadoresElenco salvar(JogadoresElenco j) {
		return repository.save(j);
	}

	public List<JogadoresElenco> encontrarTodos() {
		return repository.findAll();
	}
}
