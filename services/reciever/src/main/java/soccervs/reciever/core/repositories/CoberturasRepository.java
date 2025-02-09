package soccervs.reciever.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import soccervs.reciever.core.documents.Coberturas;

@Repository
public interface CoberturasRepository extends MongoRepository<Coberturas, Long> {

}
