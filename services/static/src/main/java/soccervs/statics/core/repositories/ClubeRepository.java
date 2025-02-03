package soccervs.statics.core.repositories;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.statics.core.dtos.ClubeByCityDTO;
import soccervs.statics.core.entities.Clubes;

@Repository
public interface ClubeRepository extends JpaRepository<Clubes, Short> {
	Short getId(Clubes clube);

	Set<ClubeByCityDTO> findByCity(String cidade);
}
