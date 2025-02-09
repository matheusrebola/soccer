package soccervs.persistence.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.persistence.core.entities.Dribles;

@Repository
public interface DriblesRepository extends JpaRepository<Dribles, Long> {

}
