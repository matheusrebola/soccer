package soccervs.statics.core.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import soccervs.statics.core.dtos.ClubeDTO;
import soccervs.statics.core.entities.Clubes;

@Repository
public interface ClubeRepository extends JpaRepository<Clubes, Long> {
	@Query("SELECT c FROM Clube c WHERE LOWER(c.nome) = LOWER(:nome)")
	Optional<Clubes> findByNome(@Param("nome") String nome);
	ClubeDTO findByCidade(String city);
	ClubeDTO findByPais(String pais);
}
