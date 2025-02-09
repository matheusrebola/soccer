package soccervs.persistence.core.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import soccervs.persistence.core.entities.enums.EEventoEspecifico;

@Entity
@Table(name="tb_eventos_especificos")
public class EventosEspecificos {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private EEventoEspecifico evento;
	private Byte minuto;
	private Long partidaId;
	private Long jogadorId;

	public EventosEspecificos(Long id, EEventoEspecifico evento, Byte minuto, Long partidaId, Long jogadorId) {
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
