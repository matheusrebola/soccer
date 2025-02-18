package soccervs.persistence.formacao.core.dtos;

import java.time.LocalDateTime;

public class Order {
	private String id;
	private LocalDateTime createdAt;
	private String transactionId;

	public Order(String id, LocalDateTime createdAt, String transactionId) {
		super();
		this.id = id;
		this.createdAt = createdAt;
		this.transactionId = transactionId;
	}

	public Order() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
}
