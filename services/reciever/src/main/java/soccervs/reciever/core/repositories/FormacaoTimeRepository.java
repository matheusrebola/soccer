package soccervs.reciever.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import soccervs.reciever.core.documents.FormacaoTime;

@Repository
public interface FormacaoTimeRepository extends MongoRepository<FormacaoTime, String> {

}
