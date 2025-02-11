package soccervs.reciever.core.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import soccervs.reciever.core.documents.Event;

public interface EventRepository extends MongoRepository<Event, String> {

    List<Event> findAllByOrderByCreatedAtDesc();

    Optional<Event> findTop1ByOrderIdOrderByCreatedAtDesc(String orderId);

    Optional<Event> findTop1ByTransactionIdOrderByCreatedAtDesc(String transactionId);
}