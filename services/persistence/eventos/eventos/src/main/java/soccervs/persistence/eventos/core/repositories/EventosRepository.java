package soccervs.persistence.eventos.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.persistence.eventos.core.entities.Eventos;

@Repository
public interface EventosRepository extends JpaRepository<Eventos, Long> {

}
