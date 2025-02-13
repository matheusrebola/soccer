package soccervs.reciever.eventos.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import soccervs.reciever.eventos.core.documents.Eventos;
import soccervs.reciever.eventos.core.repositories.EventosRepository;

@Service
public class EventoService {
	private final EventosRepository repository;

	public EventoService(EventosRepository repository) {this.repository = repository;}

	public Eventos salvar(Eventos evento) {
		return repository.save(evento);
	}

	public List<Eventos> encontrarTodos() {
		return repository.findAll();
	}
	
	
}
