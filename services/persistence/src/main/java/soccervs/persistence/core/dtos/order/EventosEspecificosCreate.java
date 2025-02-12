package soccervs.persistence.core.dtos.order;

import java.time.LocalDateTime;

import soccervs.persistence.core.dtos.Order;
import soccervs.persistence.core.entities.enums.EEventoEspecifico;

public class EventosEspecificosCreate extends Order {
	private EEventoEspecifico evento;
	private Byte minuto;
	private Long partidaId;
	private Long jogadorId;

	public EventosEspecificosCreate(EEventoEspecifico evento, Byte minuto, Long partidaId, Long jogadorId) {
		super();
		this.evento = evento;
		this.minuto = minuto;
		this.partidaId = partidaId;
		this.jogadorId = jogadorId;
	}

	public EventosEspecificosCreate(String id, LocalDateTime createdAt, String transactionId,
			EEventoEspecifico evento, Byte minuto, Long partidaId, Long jogadorId) {
		super(id, createdAt, transactionId);
		this.evento = evento;
		this.minuto = minuto;
		this.partidaId = partidaId;
		this.jogadorId = jogadorId;
	}

	public EventosEspecificosCreate() {
		super();
	}

	public EventosEspecificosCreate(String id, LocalDateTime createdAt, String transactionId) {
		super(id, createdAt, transactionId);
	}

	public EEventoEspecifico getEvento() {
		return evento;
	}

	public void setEvento(EEventoEspecifico evento) {
		this.evento = evento;
	}

	public Byte getMinuto() {
		return minuto;
	}

	public void setMinuto(Byte minuto) {
		this.minuto = minuto;
	}

	public Long getPartidaId() {
		return partidaId;
	}

	public void setPartidaId(Long partidaId) {
		this.partidaId = partidaId;
	}

	public Long getJogadorId() {
		return jogadorId;
	}

	public void setJogadorId(Long jogadorId) {
		this.jogadorId = jogadorId;
	}

}
