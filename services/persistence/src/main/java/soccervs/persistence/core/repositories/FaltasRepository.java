package soccervs.persistence.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.persistence.core.entities.Faltas;

@Repository
public interface FaltasRepository extends JpaRepository<Faltas, Long> {

}
