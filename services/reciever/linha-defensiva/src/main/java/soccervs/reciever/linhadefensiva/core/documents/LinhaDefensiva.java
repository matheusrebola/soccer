package soccervs.reciever.linhadefensiva.core.documents;

public class LinhaDefensiva {
	private Float altura;
	private Float largura;
	private Float tempo;
	private Long partidaId;
	private Long timeId;

	public LinhaDefensiva(Float altura, Float largura, Float tempo, Long partidaId, Long timeId) {
		super();
		this.altura = altura;
		this.largura = largura;
		this.tempo = tempo;
		this.partidaId = partidaId;
		this.timeId = timeId;
	}

	public LinhaDefensiva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	public Float getLargura() {
		return largura;
	}

	public void setLargura(Float largura) {
		this.largura = largura;
	}

	public Float getTempo() {
		return tempo;
	}

	public void setTempo(Float tempo) {
		this.tempo = tempo;
	}

	public Long getPartidaId() {
		return partidaId;
	}

	public void setPartidaId(Long partidaId) {
		this.partidaId = partidaId;
	}

	public Long getTimeId() {
		return timeId;
	}

	public void setTimeId(Long timeId) {
		this.timeId = timeId;
	}
}
