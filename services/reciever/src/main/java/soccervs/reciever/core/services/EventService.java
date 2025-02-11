package soccervs.reciever.core.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import soccervs.reciever.config.exception.ValidationException;
import soccervs.reciever.core.documents.Event;
import soccervs.reciever.core.dtos.EventCreateDTO;
import soccervs.reciever.core.dtos.EventFilters;
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

	public List<Event> findAll() {
		return repository.findAllByOrderByCreatedAtDesc();
	}

	public Event findByFilters(EventFilters filters) {
		validateEmptyFilters(filters);
		if (!filters.getOrderId().isEmpty()) {
			return findByOrderId(filters.getOrderId());
		} else {
			return findByTransactionId(filters.getTransactionId());
		}
	}

	private void validateEmptyFilters(EventFilters filters) {
		if (filters.getOrderId().isEmpty() && filters.getTransactionId().isEmpty()) {
			throw new ValidationException("OrderID or TransactionID must be informed.");
		}
	}

	private Event findByTransactionId(String transactionId) {
		return repository.findTop1ByTransactionIdOrderByCreatedAtDesc(transactionId)
				.orElseThrow(() -> new ValidationException("Event not found by transactionId."));
	}

	private Event findByOrderId(String orderId) {
		return repository.findTop1ByOrderIdOrderByCreatedAtDesc(orderId)
				.orElseThrow(() -> new ValidationException("Event not found by orderID."));
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
