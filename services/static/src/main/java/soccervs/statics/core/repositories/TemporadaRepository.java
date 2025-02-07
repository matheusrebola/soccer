package soccervs.statics.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.statics.core.entities.Temporadas;

@Repository
public interface TemporadaRepository extends JpaRepository<Temporadas, Long> {

}
