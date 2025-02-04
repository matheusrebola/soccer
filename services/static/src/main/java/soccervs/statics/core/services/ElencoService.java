package soccervs.statics.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soccervs.statics.core.entities.Elencos;
import soccervs.statics.core.repositories.ElencoRepository;

@Service
public class ElencoService {
	
	@Autowired
	private ElencoRepository repository;
	
	public Elencos salvar(Elencos e) {
		return repository.save(e);
	}

	public Integer pegarId(Elencos elenco) {
		return repository.findIdByElenco(elenco);
	}
	
	public List<Elencos> encontrarTodos() {
		return repository.findAll();
	}
}
