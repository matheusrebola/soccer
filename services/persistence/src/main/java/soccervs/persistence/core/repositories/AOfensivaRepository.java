package soccervs.persistence.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.persistence.core.entities.AcoesOfensivas;

@Repository
public interface AOfensivaRepository extends JpaRepository<AcoesOfensivas, Long> {

}
