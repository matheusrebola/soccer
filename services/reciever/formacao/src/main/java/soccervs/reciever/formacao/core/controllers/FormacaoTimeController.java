package soccervs.reciever.formacao.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.reciever.formacao.core.documents.Formacao;
import soccervs.reciever.formacao.core.services.FormacaoTimeService;

@RestController
@RequestMapping("/formacao-time")
public class FormacaoTimeController {

	private final FormacaoTimeService service;

	public FormacaoTimeController(FormacaoTimeService service) {
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<Formacao> criar(@RequestBody Formacao formacaoTime) {
		Formacao saved = service.salvar(formacaoTime);
		return ResponseEntity.status(HttpStatus.CREATED).body(saved);
	}

	@GetMapping
	public ResponseEntity<List<Formacao>> encontrartodos() {
		List<Formacao> formacao = service.encontrarTodos();
		return ResponseEntity.ok(formacao);
	}
}
