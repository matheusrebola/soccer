package soccervs.reciever.core.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import soccervs.reciever.core.documents.Cartoes;
import soccervs.reciever.core.documents.Event;
import soccervs.reciever.core.documents.History;
import soccervs.reciever.core.enums.ESagaStatus;
import soccervs.reciever.core.repositories.CartoesRepository;

@Service
public class CartaoService {
	
	private static final String CURRENT_SOURCE = "CARTAO_SERVICE";
	private final CartoesRepository repository;

	public CartaoService(CartoesRepository repository) {this.repository = repository;}

	public Cartoes salvar(Cartoes c) {
		return repository.save(c);
	}

	public List<Cartoes> encotrarTodos() {
		return repository.findAll();
	}

	public void notifyEnding(Event event) {
		event.setSource(CURRENT_SOURCE);
        event.setOrderId(event.getPayload().getId());
        event.setCreatedAt(LocalDateTime.now());
        setEndingHistory(event);
        save(event);		
	}
	
	private void setEndingHistory(Event event) {
        if (ESagaStatus.SUCCESS.equals(event.getStatus())) {
            addHistory(event, "Saga finished successfully!");
        } else {
            addHistory(event, "Saga finished with errors!");
        }
    }

	private void addHistory(Event event, String message) {
        var history = History
            .builder()
            .source(event.getSource())
            .status(event.getStatus())
            .message(message)
            .createdAt(LocalDateTime.now())
            .build();
        event.addToHistory(history);
    }
}
