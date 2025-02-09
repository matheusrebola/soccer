package soccervs.persistence.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.persistence.core.entities.Eventos;

@Repository
public interface EventosRepository extends JpaRepository<Eventos, Long> {

}
