package soccervs.persistence.core.entities;

import soccervs.persistence.core.entities.enums.EEvento;

public class EventosEspecificos {
	private Long id;
	private EEvento evento;
	private Byte minuto;
	private Long partidaId;
	private Long jogadorId;

	public EventosEspecificos(Long id, EEvento evento, Byte minuto, Long partidaId, Long jogadorId) {
		super();
		this.id = id;
		this.evento = evento;
		this.minuto = minuto;
		this.partidaId = partidaId;
		this.jogadorId = jogadorId;
	}

	public EventosEspecificos() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EEvento getEvento() {
		return evento;
	}

	public void setEvento(EEvento evento) {
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
