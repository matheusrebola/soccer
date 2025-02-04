package soccervs.statics.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soccervs.statics.core.repositories.PosicaoRepository;

@Service
public class PosicoesService {

	@Autowired
	private PosicaoRepository repository;
}
