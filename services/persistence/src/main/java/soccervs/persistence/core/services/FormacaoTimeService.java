package soccervs.persistence.core.services;

import org.springframework.stereotype.Service;

import soccervs.persistence.core.entities.FormacaoTime;
import soccervs.persistence.core.repositories.FormacaoTimeRepository;

@Service
public class FormacaoTimeService {

	private final FormacaoTimeRepository repository;

	public FormacaoTimeService(FormacaoTimeRepository repository) {
		this.repository = repository;
	}
	
	public FormacaoTime salvar(FormacaoTime formacaoTime) {
		return repository.save(formacaoTime);
	}
}
