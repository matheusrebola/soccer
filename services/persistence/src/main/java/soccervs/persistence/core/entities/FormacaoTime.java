package soccervs.persistence.core.entities;

import soccervs.persistence.core.entities.enums.EFormacao;

public class FormacaoTime {
	private Long id;
	private Float minuto;
	private EFormacao formacao;
	private Long jogadorId;
	private Long partidaId;

	public FormacaoTime(Long id, Float minuto, EFormacao formacao, Long jogadorId, Long partidaId) {
		super();
		this.id = id;
		this.minuto = minuto;
		this.formacao = formacao;
		this.jogadorId = jogadorId;
		this.partidaId = partidaId;
	}

	public FormacaoTime() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Float getMinuto() {
		return minuto;
	}

	public void setMinuto(Float minuto) {
		this.minuto = minuto;
	}

	public EFormacao getFormacao() {
		return formacao;
	}

	public void setFormacao(EFormacao formacao) {
		this.formacao = formacao;
	}

	public Long getJogadorId() {
		return jogadorId;
	}

	public void setJogadorId(Long jogadorId) {
		this.jogadorId = jogadorId;
	}

	public Long getPartidaId() {
		return partidaId;
	}

	public void setPartidaId(Long partidaId) {
		this.partidaId = partidaId;
	}

}
