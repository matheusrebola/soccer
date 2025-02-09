package soccervs.persistence.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.persistence.core.entities.Coberturas;

@Repository
public interface CoberturasRepository extends JpaRepository<Coberturas, Long> {

}
