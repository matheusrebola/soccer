package soccervs.persistence.core.dtos.order;

import java.time.LocalDateTime;

import soccervs.persistence.core.dtos.Order;
import soccervs.persistence.core.entities.enums.ECartao;

public class CartoesCreate extends Order {
	private Byte minuto;
	private ECartao cartao;
	private String motivo;
	private Long jogadorId;
	private Long partidaId;

	public CartoesCreate(String id, LocalDateTime createdAt, String transactionId, Byte minuto, ECartao cartao,
			String motivo, Long jogadorId, Long partidaId) {
		super(id, createdAt, transactionId);
		this.minuto = minuto;
		this.cartao = cartao;
		this.motivo = motivo;
		this.jogadorId = jogadorId;
		this.partidaId = partidaId;
	}

	public CartoesCreate(Byte minuto, ECartao cartao, String motivo, Long jogadorId, Long partidaId) {
		this.minuto = minuto;
		this.cartao = cartao;
		this.motivo = motivo;
		this.jogadorId = jogadorId;
		this.partidaId = partidaId;
	}

	public CartoesCreate() {
		super();
	}

	public CartoesCreate(String id, LocalDateTime createdAt, String transactionId) {
		super(id, createdAt, transactionId);
	}

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
