package soccervs.statics.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.statics.core.entities.JogadoresElenco;

@Repository
public interface JogadorElencoRepository extends JpaRepository<JogadoresElenco, Long> {
	
}
