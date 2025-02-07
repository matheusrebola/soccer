package soccervs.persistence.core.entities;

import soccervs.persistence.core.entities.enums.EEvento;
import soccervs.persistence.core.entities.enums.EResultado;

public class Eventos {
	private Long id;
	private Float tempo;
	private EEvento evento;
	private EResultado resultado;
	private Short eixoX;
	private Short eixoY;
	private Long jogadorId;
	private Long partidaId;

	public Eventos(Long id, Float tempo, EEvento evento, EResultado resultado, Short eixoX, Short eixoY, Long jogadorId,
			Long partidaId) {
		super();
		this.id = id;
		this.tempo = tempo;
		this.evento = evento;
		this.resultado = resultado;
		this.eixoX = eixoX;
		this.eixoY = eixoY;
		this.jogadorId = jogadorId;
		this.partidaId = partidaId;
	}

	public Eventos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
