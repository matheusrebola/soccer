package soccervs.persistence.formacao.core.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import soccervs.persistence.formacao.core.entities.enums.EFormacao;
import soccervs.persistence.formacao.core.entities.enums.EModoJogo;

@Entity
@Table(name = "tb_formacao")
public class Formacoes {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Float tempoJogo;
	@Enumerated(EnumType.STRING)
	private EFormacao formacao;
	@Enumerated(EnumType.STRING)
	private EModoJogo modoJogo;
	private Float compactacao;
	private Long timeId;
	private Long partidaId;

	public Formacoes(Long id, Float tempoJogo, EFormacao formacao, EModoJogo modoJogo, Float compactacao, Long timeId,
			Long partidaId) {
		super();
		this.id = id;
		this.tempoJogo = tempoJogo;
		this.formacao = formacao;
		this.modoJogo = modoJogo;
		this.compactacao = compactacao;
		this.timeId = timeId;
		this.partidaId = partidaId;
	}

	public Formacoes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Float getTempoJogo() {
		return tempoJogo;
	}

	public void setTempoJogo(Float tempoJogo) {
		this.tempoJogo = tempoJogo;
	}

	public EFormacao getFormacao() {
		return formacao;
	}

	public void setFormacao(EFormacao formacao) {
		this.formacao = formacao;
	}

	public EModoJogo getModoJogo() {
		return modoJogo;
	}

	public void setModoJogo(EModoJogo modoJogo) {
		this.modoJogo = modoJogo;
	}

	public Float getCompactacao() {
		return compactacao;
	}

	public void setCompactacao(Float compactacao) {
		this.compactacao = compactacao;
	}

	public Long getTimeId() {
		return timeId;
	}

	public void setTimeId(Long timeId) {
		this.timeId = timeId;
	}

	public Long getPartidaId() {
		return partidaId;
	}

	public void setPartidaId(Long partidaId) {
		this.partidaId = partidaId;
	}

}
