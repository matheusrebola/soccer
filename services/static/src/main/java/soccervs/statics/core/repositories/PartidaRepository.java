package soccervs.statics.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.statics.core.entities.Partidas;

@Repository
public interface PartidaRepository extends JpaRepository<Partidas, Long> {

}
