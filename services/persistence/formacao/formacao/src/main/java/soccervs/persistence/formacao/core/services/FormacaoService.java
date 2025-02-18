package soccervs.persistence.formacao.core.services;

import org.springframework.stereotype.Service;

import soccervs.persistence.formacao.core.entities.Formacoes;
import soccervs.persistence.formacao.core.repositories.FormacaoRepository;

@Service
public class FormacaoService {

	private final FormacaoRepository repository;

	public FormacaoService(FormacaoRepository repository) {
		this.repository = repository;
	}
	
	public Formacoes salvar(Formacoes formacaoTime) {
		return repository.save(formacaoTime);
	}
}
