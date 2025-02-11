package soccervs.reciever.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import soccervs.reciever.core.documents.Faltas;

@Repository
public interface FaltasRepository extends MongoRepository<Faltas, String> {

}
