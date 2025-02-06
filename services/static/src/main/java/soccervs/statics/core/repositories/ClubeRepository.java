package soccervs.statics.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.statics.core.entities.Clubes;

@Repository
public interface ClubeRepository extends JpaRepository<Clubes, Long> {
	
}
