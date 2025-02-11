package soccervs.reciever.core.dtos;

public class EventFilters {
	private String orderId;
	private String transactionId;

	public EventFilters(String orderId, String transactionId) {
		super();
		this.orderId = orderId;
		this.transactionId = transactionId;
	}

	public EventFilters() {
		super();
		// TODO Auto-generated constructor stub
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

}
