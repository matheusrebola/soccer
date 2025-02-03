package soccervs.statics.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.statics.core.entities.Posicoes;

@Repository
public interface PosicaoRepository extends JpaRepository<Posicoes, Byte> {

}
