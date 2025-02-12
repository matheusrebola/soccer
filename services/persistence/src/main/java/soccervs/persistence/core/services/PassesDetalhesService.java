package soccervs.persistence.core.services;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import soccervs.persistence.core.dtos.Event;
import soccervs.persistence.core.dtos.History;
import soccervs.persistence.core.entities.PassesDetalhes;
import soccervs.persistence.core.enums.ESagaStatus;
import soccervs.persistence.core.repositories.PassesDetalhesRepository;
import soccervs.persistence.core.saga.SagaExecutionController;

@Service
public class PassesDetalhesService {

	private static final String CURRENT_SOURCE = "INVENTORY_SERVICE";

	private final SagaExecutionController sagaExecutionController;
	private final PassesDetalhesRepository repository;

	public PassesDetalhesService(SagaExecutionController sagaExecutionController,
			PassesDetalhesRepository repository) {
		this.sagaExecutionController = sagaExecutionController;
		this.repository = repository;
	}

	public PassesDetalhes save(PassesDetalhes passesDetalhes) {
		return repository.save(passesDetalhes);
	}
	
	public void createPasse(Event event) {
        try {
            handleSuccess(event);
        } catch (Exception ex) {

        }
        sagaExecutionController.handleSaga(event);
    }
	
	private void handleSuccess(Event event) {
        event.setStatus(ESagaStatus.SUCCESS);
        event.setSource(CURRENT_SOURCE);
        event.getPayload();
        addHistory(event, "Inventory updated successfully!");
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
