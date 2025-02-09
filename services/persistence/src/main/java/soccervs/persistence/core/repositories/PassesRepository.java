package soccervs.persistence.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.persistence.core.entities.Passes;

@Repository
public interface PassesRepository extends JpaRepository<Passes, Long> {

}
