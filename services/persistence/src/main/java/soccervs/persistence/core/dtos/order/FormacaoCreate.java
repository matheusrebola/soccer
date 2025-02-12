package soccervs.persistence.core.dtos.order;

import java.time.LocalDateTime;

import soccervs.persistence.core.dtos.Order;
import soccervs.persistence.core.entities.enums.EFormacao;

public class FormacaoCreate extends Order {
	private Float minuto;
	private EFormacao formacao;
	private Long jogadorId;
	private Long partidaId;

	public FormacaoCreate(Float minuto, EFormacao formacao, Long jogadorId, Long partidaId) {
		super();
		this.minuto = minuto;
		this.formacao = formacao;
		this.jogadorId = jogadorId;
		this.partidaId = partidaId;
	}

	public FormacaoCreate(String id, LocalDateTime createdAt, String transactionId, Float minuto, EFormacao formacao,
			Long jogadorId, Long partidaId) {
		super(id, createdAt, transactionId);
		this.minuto = minuto;
		this.formacao = formacao;
		this.jogadorId = jogadorId;
		this.partidaId = partidaId;
	}

	public FormacaoCreate() {
		super();
	}

	public FormacaoCreate(String id, LocalDateTime createdAt, String transactionId) {
		super(id, createdAt, transactionId);
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
