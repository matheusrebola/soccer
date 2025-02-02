package soccervs.statics.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.statics.core.entities.Resultados;

@Repository
public interface ResultadoRepository extends JpaRepository<Resultados, Long> {

}
