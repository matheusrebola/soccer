package soccervs.statics.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.statics.core.entities.Titulos;

@Repository
public interface TituloRepository extends JpaRepository<Titulos, Integer> {

}
