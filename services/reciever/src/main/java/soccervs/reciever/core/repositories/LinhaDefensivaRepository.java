package soccervs.reciever.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import soccervs.reciever.core.documents.LinhaDefensiva;

@Repository
public interface LinhaDefensivaRepository extends MongoRepository<LinhaDefensiva, Long> {

}
