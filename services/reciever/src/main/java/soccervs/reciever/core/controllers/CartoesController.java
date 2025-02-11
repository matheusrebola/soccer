package soccervs.reciever.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.reciever.core.documents.Cartoes;
import soccervs.reciever.core.services.CartaoService;

@RestController
@RequestMapping("/cartoes")
public class CartoesController {
	
	private final CartaoService service;
	
	public CartoesController(CartaoService service) {
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<Cartoes> criar(@RequestBody Cartoes cartao){
		Cartoes saved = service.salvar(cartao);
		return ResponseEntity.status(HttpStatus.CREATED).body(saved);
	}
}
