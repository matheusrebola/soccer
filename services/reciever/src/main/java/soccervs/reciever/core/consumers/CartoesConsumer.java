package soccervs.reciever.core.consumers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import soccervs.reciever.core.services.CartaoService;
import soccervs.reciever.core.utils.JsonUtil;

@Component
public class CartoesConsumer {

	private final CartaoService service;
	private final JsonUtil jsonUtil;

	public CartoesConsumer(CartaoService service, JsonUtil jsonUtil) {
		super();
		this.service = service;
		this.jsonUtil = jsonUtil;
	}

	@KafkaListener(
			groupId = "${spring.kafka.consumer.group-id}", 
			topics = "${spring.kafka.topic.cartoes-ending}")
	public void consumeNotifyEndingEvent(String payload) {
		var event = jsonUtil.toEvent(payload);
		service.notifyEnding(event);
	}
}
