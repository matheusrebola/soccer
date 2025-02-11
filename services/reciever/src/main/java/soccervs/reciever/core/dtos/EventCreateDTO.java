package soccervs.reciever.core.dtos;

import java.time.LocalDateTime;
import java.util.List;

import soccervs.reciever.core.documents.History;
import soccervs.reciever.core.enums.ESagaStatus;

public class EventCreateDTO {
	private String transactionId;
	private String orderId;
	private Object payload;
	private String source;
	private ESagaStatus status;
	private List<History> eventHistory;
	private LocalDateTime createdAt;

	public EventCreateDTO(String transactionId, String orderId, Object payload, String source, ESagaStatus status,
			List<History> eventHistory, LocalDateTime createdAt) {
		super();
		this.transactionId = transactionId;
		this.orderId = orderId;
		this.payload = payload;
		this.source = source;
		this.status = status;
		this.eventHistory = eventHistory;
		this.createdAt = createdAt;
	}

	public EventCreateDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Object getPayload() {
		return payload;
	}

	public void setPayload(Object payload) {
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

}
