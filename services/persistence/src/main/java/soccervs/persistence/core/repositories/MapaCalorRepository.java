package soccervs.persistence.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.persistence.core.entities.MapaCalor;

@Repository
public interface MapaCalorRepository extends JpaRepository<MapaCalor, Long> {

}
