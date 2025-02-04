package soccervs.statics.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import soccervs.statics.core.entities.Partidas;

@Repository
public interface PartidaRepository extends JpaRepository<Partidas, Long> {
	@Query("SELECT p.id FROM Partidas p WHERE p = :partida")
	Long findIdByPartida(@Param("partida") Partidas partida);

}
