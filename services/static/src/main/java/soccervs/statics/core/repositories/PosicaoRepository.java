package soccervs.statics.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import soccervs.statics.core.entities.Posicoes;

@Repository
public interface PosicaoRepository extends JpaRepository<Posicoes, Long> {
	@Query("SELECT p.id FROM Posicoes p WHERE p = :posicao")
	Byte findIdByPosicao(@Param("posicao") Posicoes posicao);

}
