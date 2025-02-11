package soccervs.reciever.core.builders;

import soccervs.reciever.core.documents.Cartoes;
import soccervs.reciever.core.documents.enums.ECartao;

public class CartaoBuilder {
	private String id;
	private Byte minuto;
	private ECartao cartao;
	private String motivo;
	private Long jogadorId;
	private Long partidaId;

	public String getId() {
		return id;
	}

	public CartaoBuilder setId(String id) {
		this.id = id;
		return this;
	}

	public Byte getMinuto() {
		return minuto;
	}

	public CartaoBuilder setMinuto(Byte minuto) {
		this.minuto = minuto;
		return this;
	}

	public ECartao getCartao() {
		return cartao;
	}

	public CartaoBuilder setCartao(ECartao cartao) {
		this.cartao = cartao;
		return this;
	}

	public String getMotivo() {
		return motivo;
	}

	public CartaoBuilder setMotivo(String motivo) {
		this.motivo = motivo;
		return this;
	}

	public Long getJogadorId() {
		return jogadorId;
	}

	public CartaoBuilder setJogadorId(Long jogadorId) {
		this.jogadorId = jogadorId;
		return this;
	}

	public Long getPartidaId() {
		return partidaId;
	}

	public CartaoBuilder setPartidaId(Long partidaId) {
		this.partidaId = partidaId;
		return this;
	}

	public Cartoes build() {
		return new Cartoes(this);
	}
}
