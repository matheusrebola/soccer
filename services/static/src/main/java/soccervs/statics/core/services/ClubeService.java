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
	
	public Clubes save(Clubes clube) {
		return repository.save(clube);
	}

	public Short getId(Clubes clube) {
		return repository.getId(clube);
	}

	public List<Clubes> findAll() {
		return repository.findAll();
	}
	
	public Set<ClubeByCityDTO> findByCity(String cidade) {
		return repository.findByCity(cidade);
	}
}
