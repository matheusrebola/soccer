package soccervs.statics.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.statics.core.entities.Jogadores;

@Repository
public interface JogadorRepository extends JpaRepository<Jogadores, Long> {

}
