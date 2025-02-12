package soccervs.persistence.core.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import soccervs.persistence.core.services.PassesDetalhesService;
import soccervs.persistence.core.utils.JsonUtil;

@Component
public class PassesDetalhesConsumer {

	private final PassesDetalhesService detalhesService;
	private final JsonUtil jsonUtil;

	public PassesDetalhesConsumer(PassesDetalhesService detalhesService, JsonUtil jsonUtil) {
		super();
		this.detalhesService = detalhesService;
		this.jsonUtil = jsonUtil;
	}

	@KafkaListener(groupId = "${spring.kafka.consumer.group-id}", topics = "${spring.kafka.topic.persistence-success}")
	public void consumeSuccessEvent(String payload) {
		// log.info("Receiving success event {} from inventory-success topic", payload);
		var event = jsonUtil.toEvent(payload);
		detalhesService.createPasse(event);
	}

}
