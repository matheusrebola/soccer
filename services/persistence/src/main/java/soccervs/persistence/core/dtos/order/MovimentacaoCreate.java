package soccervs.persistence.core.dtos.order;

import java.time.LocalDateTime;

import soccervs.persistence.core.dtos.Order;

public class MovimentacaoCreate extends Order {
	private Short eixoX;
	private Short eixoY;
	private Float aceleracao;
	private Float desaceleracao;
	private Byte pressao;
	private Long jogadorId;
	private Long partidaId;

	public MovimentacaoCreate(Short eixoX, Short eixoY, Float aceleracao, Float desaceleracao, Byte pressao,
			Long jogadorId, Long partidaId) {
		super();
		this.eixoX = eixoX;
		this.eixoY = eixoY;
		this.aceleracao = aceleracao;
		this.desaceleracao = desaceleracao;
		this.pressao = pressao;
		this.jogadorId = jogadorId;
		this.partidaId = partidaId;
	}

	public MovimentacaoCreate(String id, LocalDateTime createdAt, String transactionId, Short eixoX, Short eixoY,
			Float aceleracao, Float desaceleracao, Byte pressao, Long jogadorId, Long partidaId) {
		super(id, createdAt, transactionId);
		this.eixoX = eixoX;
		this.eixoY = eixoY;
		this.aceleracao = aceleracao;
		this.desaceleracao = desaceleracao;
		this.pressao = pressao;
		this.jogadorId = jogadorId;
		this.partidaId = partidaId;
	}

	public MovimentacaoCreate() {
	}

	public Short getEixoX() {
		return eixoX;
	}

	public void setEixoX(Short eixoX) {
		this.eixoX = eixoX;
	}

	public Short getEixoY() {
		return eixoY;
	}

	public void setEixoY(Short eixoY) {
		this.eixoY = eixoY;
	}

	public Float getAceleracao() {
		return aceleracao;
	}

	public void setAceleracao(Float aceleracao) {
		this.aceleracao = aceleracao;
	}

	public Float getDesaceleracao() {
		return desaceleracao;
	}

	public void setDesaceleracao(Float desaceleracao) {
		this.desaceleracao = desaceleracao;
	}

	public Byte getPressao() {
		return pressao;
	}

	public void setPressao(Byte pressao) {
		this.pressao = pressao;
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
