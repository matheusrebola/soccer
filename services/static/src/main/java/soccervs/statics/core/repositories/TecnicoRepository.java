package soccervs.statics.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.statics.core.entities.Tecnicos;

@Repository
public interface TecnicoRepository extends JpaRepository<Tecnicos, Integer> {

}
