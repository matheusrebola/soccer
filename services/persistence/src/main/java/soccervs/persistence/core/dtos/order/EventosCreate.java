package soccervs.persistence.core.dtos.order;

import java.time.LocalDateTime;

import soccervs.persistence.core.dtos.Order;
import soccervs.persistence.core.entities.enums.EEvento;
import soccervs.persistence.core.entities.enums.EResultado;

public class EventosCreate extends Order {
	private Float tempo;
	private EEvento evento;
	private EResultado resultado;
	private Short eixoX;
	private Short eixoY;
	private Long jogadorId;
	private Long partidaId;

	public EventosCreate(String id, LocalDateTime createdAt, String transactionId, Float tempo, EEvento evento,
			EResultado resultado, Short eixoX, Short eixoY, Long jogadorId, Long partidaId) {
		super(id, createdAt, transactionId);
		this.tempo = tempo;
		this.evento = evento;
		this.resultado = resultado;
		this.eixoX = eixoX;
		this.eixoY = eixoY;
		this.jogadorId = jogadorId;
		this.partidaId = partidaId;
	}

	public EventosCreate(Float tempo, EEvento evento, EResultado resultado, Short eixoX, Short eixoY, Long jogadorId,
			Long partidaId) {
		this.tempo = tempo;
		this.evento = evento;
		this.resultado = resultado;
		this.eixoX = eixoX;
		this.eixoY = eixoY;
		this.jogadorId = jogadorId;
		this.partidaId = partidaId;
	}

	public EventosCreate(String id, LocalDateTime createdAt, String transactionId) {
		super(id, createdAt, transactionId);
	}

	public EventosCreate() {
		super();
	}

	public Float getTempo() {
		return tempo;
	}

	public void setTempo(Float tempo) {
		this.tempo = tempo;
	}

	public EEvento getEvento() {
		return evento;
	}

	public void setEvento(EEvento evento) {
		this.evento = evento;
	}

	public EResultado getResultado() {
		return resultado;
	}

	public void setResultado(EResultado resultado) {
		this.resultado = resultado;
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
