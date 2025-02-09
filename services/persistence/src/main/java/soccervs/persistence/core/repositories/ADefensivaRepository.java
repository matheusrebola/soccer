package soccervs.persistence.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.persistence.core.entities.AcoesDefensivas;

@Repository
public interface ADefensivaRepository extends JpaRepository<AcoesDefensivas, Long> {

}
