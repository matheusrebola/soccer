package soccervs.persistence.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.persistence.core.entities.PosicaoMedia;

@Repository
public interface PosicaoMediaRepository extends JpaRepository<PosicaoMedia, Long> {

}
