package soccervs.persistence.eventos.core.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import soccervs.persistence.eventos.core.entities.enums.EEvento;
import soccervs.persistence.eventos.core.entities.enums.EGravidade;
import soccervs.persistence.eventos.core.entities.enums.EMotivo;
import soccervs.persistence.eventos.core.entities.enums.EResultado;

@Entity
@Table(name = "tb_eventos")
public class Eventos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Enumerated(EnumType.STRING)
	private EEvento evento;
	private Float distancia;
	@Enumerated(EnumType.STRING)
	private EResultado resultado;
	@Enumerated(EnumType.STRING)
	private EGravidade gravidade;
	@Enumerated(EnumType.STRING)
	private EMotivo motivo;
	private Float tempo;
	private Float posX;
	private Float posY;
	private Long partidaId;
	private Long jogadorOrigemId;
	private Long jogadordestinoId;

	public Eventos(Long id, EEvento evento, Float distancia, EResultado resultado, EGravidade gravidade, EMotivo motivo,
			Float tempo, Float posX, Float posY, Long partidaId, Long jogadorOrigemId, Long jogadordestinoId) {
		super();
		this.id = id;
		this.evento = evento;
		this.distancia = distancia;
		this.resultado = resultado;
		this.gravidade = gravidade;
		this.motivo = motivo;
		this.tempo = tempo;
		this.posX = posX;
		this.posY = posY;
		this.partidaId = partidaId;
		this.jogadorOrigemId = jogadorOrigemId;
		this.jogadordestinoId = jogadordestinoId;
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

	public EEvento getEvento() {
		return evento;
	}

	public void setEvento(EEvento evento) {
		this.evento = evento;
	}

	public Float getDistancia() {
		return distancia;
	}

	public void setDistancia(Float distancia) {
		this.distancia = distancia;
	}

	public EResultado getResultado() {
		return resultado;
	}

	public void setResultado(EResultado resultado) {
		this.resultado = resultado;
	}

	public EGravidade getGravidade() {
		return gravidade;
	}

	public void setGravidade(EGravidade gravidade) {
		this.gravidade = gravidade;
	}

	public EMotivo getMotivo() {
		return motivo;
	}

	public void setMotivo(EMotivo motivo) {
		this.motivo = motivo;
	}

	public Float getTempo() {
		return tempo;
	}

	public void setTempo(Float tempo) {
		this.tempo = tempo;
	}

	public Float getPosX() {
		return posX;
	}

	public void setPosX(Float posX) {
		this.posX = posX;
	}

	public Float getPosY() {
		return posY;
	}

	public void setPosY(Float posY) {
		this.posY = posY;
	}

	public Long getPartidaId() {
		return partidaId;
	}

	public void setPartidaId(Long partidaId) {
		this.partidaId = partidaId;
	}

	public Long getJogadorOrigemId() {
		return jogadorOrigemId;
	}

	public void setJogadorOrigemId(Long jogadorOrigemId) {
		this.jogadorOrigemId = jogadorOrigemId;
	}

	public Long getJogadordestinoId() {
		return jogadordestinoId;
	}

	public void setJogadordestinoId(Long jogadordestinoId) {
		this.jogadordestinoId = jogadordestinoId;
	}

}
