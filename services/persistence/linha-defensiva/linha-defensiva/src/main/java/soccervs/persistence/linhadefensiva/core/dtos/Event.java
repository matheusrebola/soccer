package soccervs.persistence.linhadefensiva.core.dtos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Event {

	private String id;
	private String orderId;
	private String transactionId;
	private Order payload;
	private String source;
	private ESagaStatus status;
	private List<History> eventHistory;
	private LocalDateTime createdAt;

	public Event(String id, String orderId, String transactionId, Order payload, String source, ESagaStatus status,
			List<History> eventHistory, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.transactionId = transactionId;
		this.payload = payload;
		this.source = source;
		this.status = status;
		this.eventHistory = eventHistory;
		this.createdAt = createdAt;
	}

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Order getPayload() {
		return payload;
	}

	public void setPayload(Order payload) {
		this.payload = payload;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public ESagaStatus getStatus() {
		return status;
	}

	public void setStatus(ESagaStatus status) {
		this.status = status;
	}

	public List<History> getEventHistory() {
		return eventHistory;
	}

	public void setEventHistory(List<History> eventHistory) {
		this.eventHistory = eventHistory;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public void addToHistory(History history) {
		if (eventHistory.isEmpty()) {
			eventHistory = new ArrayList<>();
		}
		eventHistory.add(history);
	}
}
