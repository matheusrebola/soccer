package soccervs.reciever.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import soccervs.reciever.core.documents.EventosEspecificos;

@Repository
public interface EventosEspecificosRepository extends MongoRepository<EventosEspecificos, Long> {

}
