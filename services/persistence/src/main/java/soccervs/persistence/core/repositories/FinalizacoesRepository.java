package soccervs.persistence.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.persistence.core.entities.Finalizacoes;

@Repository
public interface FinalizacoesRepository extends JpaRepository<Finalizacoes, Long> {

}
