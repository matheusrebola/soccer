package soccervs.reciever.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.reciever.core.documents.FormacaoTime;
import soccervs.reciever.core.services.FormacaoTimeService;

@RestController
@RequestMapping("/formacao-time")
public class FormacaoTimeController {

	private final FormacaoTimeService service;

	public FormacaoTimeController(FormacaoTimeService service) {this.service = service;}

	@PostMapping
	public ResponseEntity<FormacaoTime> criar(@RequestBody FormacaoTime formacaoTime) {
		FormacaoTime saved = service.salvar(formacaoTime);
		return ResponseEntity.status(HttpStatus.CREATED).body(saved);
	}
}
