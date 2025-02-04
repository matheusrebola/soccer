package soccervs.statics.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soccervs.statics.core.repositories.JogadorElencoRepository;

@Service
public class JElencoService {

	@Autowired
	private JogadorElencoRepository repository;
}
