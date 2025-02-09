package soccervs.persistence.core.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import soccervs.persistence.core.entities.enums.EInteracao;

@Entity
@Table(name="tb_relacao_jogadores")
public class RelacaoJogadores {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="jogador_numero1_id")
	private Long j1Id;
	@Column(name="jogador_numero2_id")
	private Long j2Id;
	@Enumerated(EnumType.STRING)
	private EInteracao interacao;
	private Long partidaId;

	public RelacaoJogadores(Long id, Long j1Id, Long j2Id, EInteracao interacao, Long partidaId) {
		super();
		this.id = id;
		this.j1Id = j1Id;
		this.j2Id = j2Id;
		this.interacao = interacao;
		this.partidaId = partidaId;
	}

	public RelacaoJogadores() {
		super();
		// TODO Auto-generated constructor stub
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
