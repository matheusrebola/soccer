package soccervs.statics.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import soccervs.statics.core.entities.Jogadores;

@Repository
public interface JogadorRepository extends JpaRepository<Jogadores, Long> {
	@Query("SELECT j.id FROM Jogadores j WHERE j = :jogador")
	Long findIdByJogador(@Param("jogador") Jogadores j);

}
