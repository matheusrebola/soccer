package soccervs.reciever.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.reciever.core.documents.Finalizacoes;
import soccervs.reciever.core.services.FinalizacoesService;

@RestController
@RequestMapping("/finalizacoes")
public class FinalizacoesController {
	
	private final FinalizacoesService service;

	public FinalizacoesController(FinalizacoesService service) {this.service = service;}
	
	@PostMapping
	public ResponseEntity<Finalizacoes> criar(@RequestBody Finalizacoes finalizacoes) {
		Finalizacoes saved = service.salvar(finalizacoes);
		return ResponseEntity.status(HttpStatus.CREATED).body(saved);
	}
}
