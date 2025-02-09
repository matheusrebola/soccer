package soccervs.persistence.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.persistence.core.entities.EstatisticasPartida;

@Repository
public interface EstatisticaPRepository extends JpaRepository<EstatisticasPartida, Long> {

}
