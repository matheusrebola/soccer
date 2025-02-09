package soccervs.reciever.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import soccervs.reciever.core.documents.MapaCalor;

@Repository
public interface MapaCalorRepository extends MongoRepository<MapaCalor, Long> {

}
