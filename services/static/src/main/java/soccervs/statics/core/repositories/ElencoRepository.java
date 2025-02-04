package soccervs.statics.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import soccervs.statics.core.entities.Elencos;

@Repository
public interface ElencoRepository extends JpaRepository<Elencos, Integer> {
	@Query("SELECT e.id FROM Elencos e WHERE e = :elenco")
    Integer findIdByElenco(@Param("elenco") Elencos elenco);
}
