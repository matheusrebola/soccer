package soccervs.persistence.core.dtos.order;

import java.time.LocalDateTime;

import soccervs.persistence.core.dtos.Order;
import soccervs.persistence.core.entities.enums.EFalta;
import soccervs.persistence.core.entities.enums.EGravidade;
import soccervs.persistence.core.entities.enums.EResultadoF;

public class FaltasCreate extends Order {
	private Byte min;
	private Short eixoX;
	private Short eixoY;
	private EFalta falta;
	private EResultadoF resultado;
	private EGravidade gravidade;
	private Long jogadorId;
	private Long partidaId;

	public FaltasCreate(Byte min, Short eixoX, Short eixoY, EFalta falta, EResultadoF resultado,
			EGravidade gravidade, Long jogadorId, Long partidaId) {
		super();
		this.min = min;
		this.eixoX = eixoX;
		this.eixoY = eixoY;
		this.falta = falta;
		this.resultado = resultado;
		this.gravidade = gravidade;
		this.jogadorId = jogadorId;
		this.partidaId = partidaId;
	}

	public FaltasCreate(String id, LocalDateTime createdAt, String transactionId, Byte min, Short eixoX, Short eixoY,
			EFalta falta, EResultadoF resultado, EGravidade gravidade, Long jogadorId, Long partidaId) {
		super(id, createdAt, transactionId);
		this.min = min;
		this.eixoX = eixoX;
		this.eixoY = eixoY;
		this.falta = falta;
		this.resultado = resultado;
		this.gravidade = gravidade;
		this.jogadorId = jogadorId;
		this.partidaId = partidaId;
	}

	public FaltasCreate() {
		super();
	}

	public FaltasCreate(String id, LocalDateTime createdAt, String transactionId) {
		super(id, createdAt, transactionId);
	}

	public Byte getMin() {
		return min;
	}

	public void setMin(Byte min) {
		this.min = min;
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

	public EFalta getFalta() {
		return falta;
	}

	public void setFalta(EFalta falta) {
		this.falta = falta;
	}

	public EResultadoF getResultado() {
		return resultado;
	}

	public void setResultado(EResultadoF resultado) {
		this.resultado = resultado;
	}

	public EGravidade getGravidade() {
		return gravidade;
	}

	public void setGravidade(EGravidade gravidade) {
		this.gravidade = gravidade;
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
