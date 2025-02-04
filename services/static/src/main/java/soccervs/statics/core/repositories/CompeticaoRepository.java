package soccervs.statics.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import soccervs.statics.core.entities.Competicoes;

@Repository
public interface CompeticaoRepository extends JpaRepository<Competicoes, Short> {
	@Query("SELECT c.id FROM Competicoes c WHERE c = :competicao")
    Short findIdByCompeticao(@Param("competicao") Competicoes competicao);

}
