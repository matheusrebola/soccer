package soccervs.persistence.relacao.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.persistence.relacao.core.entities.Relacoes;

@Repository
public interface RelacaoRepository extends JpaRepository<Relacoes, Long> {

}
