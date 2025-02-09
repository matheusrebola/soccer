package soccervs.reciever.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import soccervs.reciever.core.documents.AcoesOfensivas;

@Repository
public interface AOfensivaRepository extends MongoRepository<AcoesOfensivas, Long> {

}
