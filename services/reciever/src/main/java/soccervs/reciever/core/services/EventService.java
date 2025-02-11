package soccervs.reciever.core.services;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import soccervs.reciever.core.documents.Event;
import soccervs.reciever.core.dtos.EventCreateDTO;
import soccervs.reciever.core.enums.ESagaStatus;
import soccervs.reciever.core.mappers.EventMapper;
import soccervs.reciever.core.mappers.HistoryMapper;
import soccervs.reciever.core.repositories.EventRepository;

@Service
public class EventService {
	private static final String CURRENT_SOURCE = "ORDER_SERVICE";

	private final EventRepository repository;
	private final EventMapper eventMapper;
	private final HistoryMapper historyMapper;

	public EventService(EventRepository repository, EventMapper eventMapper, HistoryMapper historyMapper) {
		super();
		this.repository = repository;
		this.eventMapper = eventMapper;
		this.historyMapper = historyMapper;
	}

	public void notifyEnding(Event event) {
		event.setSource(CURRENT_SOURCE);
		event.setOrderId(((Event) event.getPayload()).getId());
		event.setCreatedAt(LocalDateTime.now());
		setEndingHistory(event);
		save(event);
		// log.info("Order {} with saga notified! TransactionId: {}",
		// event.getOrderId(), event.getTransactionId());
	}

	private void setEndingHistory(Event event) {
		if (event.getStatus().equals(ESagaStatus.SUCCESS)) {
			// log.info("SAGA FINISHED SUCCESSFULLY FOR EVENT {}", event.getId());
			addHistory(event, "Saga finished successfully!");
		} else {
			// log.info("SAGA FINISHED WITH ERRORS FOR EVENT {}", event.getId());
			addHistory(event, "Saga finished with errors!");
		}
	}

	public Event save(Event event) {
		return repository.save(event);
	}

	public Event createEvent(EventCreateDTO dto) {
		var event = eventMapper.map(dto);
		addHistory(event, "Saga started!");
		return save(event);
	}

	private void addHistory(Event event, String message) {
		var history = historyMapper.map(event);
		event.addToHistory(history);
	}
}
