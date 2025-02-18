package soccervs.persistence.relacao.core.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import soccervs.persistence.relacao.core.entities.enums.EInteracao;

@Entity
@Table(name = "tb_relacao_jogadores")
public class Relacoes {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long j1Id;
	private Long j2Id;
	private EInteracao interacao;
	private Long partidaId;

	public Relacoes(Long id, Long j1Id, Long j2Id, EInteracao interacao, Long partidaId) {
		super();
		this.id = id;
		this.j1Id = j1Id;
		this.j2Id = j2Id;
		this.interacao = interacao;
		this.partidaId = partidaId;
	}

	public Relacoes() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getJ1Id() {
		return j1Id;
	}

	public void setJ1Id(Long j1Id) {
		this.j1Id = j1Id;
	}

	public Long getJ2Id() {
		return j2Id;
	}

	public void setJ2Id(Long j2Id) {
		this.j2Id = j2Id;
	}

	public EInteracao getInteracao() {
		return interacao;
	}

	public void setInteracao(EInteracao interacao) {
		this.interacao = interacao;
	}

	public Long getPartidaId() {
		return partidaId;
	}

	public void setPartidaId(Long partidaId) {
		this.partidaId = partidaId;
	}

}
