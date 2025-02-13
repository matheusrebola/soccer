package soccervs.reciever.core.producers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class PassesDetalhesProducer {

	private final KafkaTemplate<String, String> kafkaTemplate;

	public PassesDetalhesProducer(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}
	
	@Value("${spring.kafka.topic.passes-detalhes-start}")
    private String passesDetalhesStartTopic;
	
	public void sendEvent(String payload) {
		kafkaTemplate.send(passesDetalhesStartTopic, payload);
	}
}
