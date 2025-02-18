package soccervs.reciever.formacao.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import soccervs.reciever.formacao.core.documents.Formacao;
import soccervs.reciever.formacao.core.repositories.FormacaoTimeRepository;

@Service
public class FormacaoTimeService {

	private final FormacaoTimeRepository repository;

	public FormacaoTimeService(FormacaoTimeRepository repository) {this.repository = repository;}

	public Formacao salvar(Formacao formacaoTime) {
		return repository.save(formacaoTime);
	}

	public List<Formacao> encontrarTodos() {
		return repository.findAll();
	}

}
