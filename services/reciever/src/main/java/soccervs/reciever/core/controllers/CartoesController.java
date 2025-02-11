package soccervs.reciever.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.reciever.core.documents.Cartoes;
import soccervs.reciever.core.dtos.CartoesCreateDTO;
import soccervs.reciever.core.dtos.CartoesDTO;
import soccervs.reciever.core.mappers.CartaoMapper;
import soccervs.reciever.core.services.CartaoService;

@RestController
@RequestMapping("/cartoes")
public class CartoesController {
	
	private final CartaoMapper mapper;
	private final CartaoService service;
	
	public CartoesController(CartaoMapper mapper, CartaoService service) {
		this.mapper = mapper;
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<CartoesDTO> criar(@RequestBody CartoesCreateDTO createDTO){
		Cartoes cartao = mapper.map(createDTO);
		Cartoes saved = service.salvar(cartao);
		CartoesDTO dto = mapper.map(saved);			
		return ResponseEntity.status(HttpStatus.CREATED).body(dto);
	}
}
