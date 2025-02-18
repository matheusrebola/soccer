package soccervs.persistence.eventos.core.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {

	private final KafkaTemplate<String, String> kafkaTemplate;

	public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}

	public void sendEvent(String payload, String topic) {
		try {
			//log.info("Sending event to topic {} with data {}", topic, payload);
			kafkaTemplate.send(topic, payload);
		} catch (Exception ex) {
			//log.error("Error trying to send data to topic {} with data {}", topic, payload, ex);
		}
	}
}
