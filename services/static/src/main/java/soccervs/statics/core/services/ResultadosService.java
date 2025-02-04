package soccervs.statics.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soccervs.statics.core.repositories.ResultadoRepository;

@Service
public class ResultadosService {

	@Autowired
	private ResultadoRepository repository;
}
