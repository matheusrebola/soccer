package soccervs.persistence.formacao.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.persistence.formacao.core.entities.Formacoes;

@Repository
public interface FormacaoRepository extends JpaRepository<Formacoes, Long> {

}
