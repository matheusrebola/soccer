package soccervs.persistence.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.persistence.core.entities.RelacaoJogadores;

@Repository
public interface RelacaoJogadoresRepository extends JpaRepository<RelacaoJogadores, Long> {

}
