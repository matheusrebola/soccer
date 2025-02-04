package soccervs.statics.core.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soccervs.statics.core.dtos.ClubeByCityDTO;
import soccervs.statics.core.entities.Clubes;
import soccervs.statics.core.repositories.ClubeRepository;

@Service
public class ClubeService {
	@Autowired
	private ClubeRepository repository;
	
	public Clubes salvar(Clubes clube) {
		return repository.save(clube);
	}

	public Short pegarId(Clubes clube) {
		return repository.findIdByClube(clube);
	}

	public List<Clubes> encontrarTodos() {
		return repository.findAll();
	}
	
	public Set<ClubeByCityDTO> encontrarPelaCidade(String cidade) {
		return repository.findByCity(cidade);
	}
}
