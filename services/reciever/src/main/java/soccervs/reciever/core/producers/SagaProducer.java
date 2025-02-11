package soccervs.reciever.core.producers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SagaProducer {

	private static final Logger log = LoggerFactory.getLogger(SagaProducer.class);
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final String persistenceStartTopic;

    public SagaProducer(KafkaTemplate<String, String> kafkaTemplate, 
                        @Value("${spring.kafka.topic.persistence-start}") String persistenceStartTopic) {
        this.kafkaTemplate = kafkaTemplate;
        this.persistenceStartTopic = persistenceStartTopic;
    }

    public void sendEvent(String payload) {
        try {
            log.info("Sending event to topic {} with data {}", persistenceStartTopic, payload);
            kafkaTemplate.send(persistenceStartTopic, payload);
        } catch (Exception ex) {
            log.error("Error trying to send data to topic {} with data {}", persistenceStartTopic, payload, ex);
        }
    }
}
