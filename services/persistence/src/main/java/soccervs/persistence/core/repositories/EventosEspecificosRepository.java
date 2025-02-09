package soccervs.persistence.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.persistence.core.entities.EventosEspecificos;

@Repository
public interface EventosEspecificosRepository extends JpaRepository<EventosEspecificos, Long> {

}
