package soccervs.persistence.core.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import soccervs.persistence.core.entities.enums.ECartao;

@Entity
@Table(name="tb_cartoes")
public class Cartoes {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Byte minuto;
	@Enumerated(EnumType.STRING)
	private ECartao cartao;
	private String motivo;
	private Long jogadorId;
	private Long partidaId;
	
	public Cartoes(Long id, Byte minuto, ECartao cartao, String motivo, Long jogadorId, Long partidaId) {
		super();
		this.id = id;
		this.minuto = minuto;
		this.cartao = cartao;
		this.motivo = motivo;
		this.jogadorId = jogadorId;
		this.partidaId = partidaId;
	}

	public Cartoes() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
