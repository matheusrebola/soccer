package soccervs.statics.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import soccervs.statics.core.entities.JogadoresElenco;

@Repository
public interface JogadorElencoRepository extends JpaRepository<JogadoresElenco, Integer> {
	@Query("SELECT j.id FROM JogadoresElenco j WHERE j = :jogador")
	Integer findIdByJogadorElenco(@Param("jogador") JogadoresElenco j);

}
