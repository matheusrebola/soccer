package soccervs.persistence.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.persistence.core.entities.PassesDetalhes;

@Repository
public interface PassesDetalhesRepository extends JpaRepository<PassesDetalhes, Long> {

}
