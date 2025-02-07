package soccervs.statics.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.statics.core.entities.Competicoes;

@Repository
public interface CompeticaoRepository extends JpaRepository<Competicoes, Long> {

}
