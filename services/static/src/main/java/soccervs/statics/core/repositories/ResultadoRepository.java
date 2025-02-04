package soccervs.statics.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import soccervs.statics.core.entities.Resultados;

@Repository
public interface ResultadoRepository extends JpaRepository<Resultados, Long> {
	@Query("SELECT r.id FROM Resultados r WHERE r = :resultado")
	Long findIdByResultado(@Param("resultado") Resultados resultado);

}
