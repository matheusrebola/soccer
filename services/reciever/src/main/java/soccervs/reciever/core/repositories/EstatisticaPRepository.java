package soccervs.reciever.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import soccervs.reciever.core.documents.EstatisticasPartida;

@Repository
public interface EstatisticaPRepository extends MongoRepository<EstatisticasPartida, Long> {

}
