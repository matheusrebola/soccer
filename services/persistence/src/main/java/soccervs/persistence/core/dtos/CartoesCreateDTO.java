package soccervs.persistence.core.dtos;

import soccervs.persistence.core.entities.enums.ECartao;

public class CartoesCreateDTO {
	private Byte minuto;
	private ECartao cartao;
	private String motivo;
	private Long jogadorId;
	private Long partidaId;
	
	public CartoesCreateDTO(Byte minuto, ECartao cartao, String motivo, Long jogadorId, Long partidaId) {
		super();
		this.minuto = minuto;
		this.cartao = cartao;
		this.motivo = motivo;
		this.jogadorId = jogadorId;
		this.partidaId = partidaId;
	}

	public CartoesCreateDTO() {}

	public Byte getMinuto() {
		return minuto;
	}

	public void setMinuto(Byte minuto) {
		this.minuto = minuto;
	}

	public ECartao getCartao() {
		return cartao;
	}

	public void setCartao(ECartao cartao) {
		this.cartao = cartao;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
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
