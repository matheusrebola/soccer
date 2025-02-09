package soccervs.reciever.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import soccervs.reciever.core.documents.Dribles;

@Repository
public interface DriblesRepository extends MongoRepository<Dribles, Long> {

}
