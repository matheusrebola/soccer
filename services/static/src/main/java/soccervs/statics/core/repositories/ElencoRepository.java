package soccervs.statics.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.statics.core.entities.Elencos;

@Repository
public interface ElencoRepository extends JpaRepository<Elencos, Integer> {

}
