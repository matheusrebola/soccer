package soccervs.reciever.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import soccervs.reciever.core.documents.Movimentacao;

@Repository
public interface MovimentacaoRepository extends MongoRepository<Movimentacao, String> {

}
