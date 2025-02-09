package soccervs.reciever.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import soccervs.reciever.core.documents.Passes;

@Repository
public interface PassesRepository extends MongoRepository<Passes, Long> {

}
