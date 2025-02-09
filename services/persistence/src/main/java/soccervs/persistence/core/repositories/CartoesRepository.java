package soccervs.persistence.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.persistence.core.entities.Cartoes;

@Repository
public interface CartoesRepository extends JpaRepository<Cartoes, Long> {

}
