package soccervs.persistence.linhadefensiva.core.repositoies;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.persistence.core.entities.LinhaDefensiva;

@Repository
public interface LinhaDefensivaRepository extends JpaRepository<LinhaDefensiva, Long> {

}
