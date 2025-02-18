package soccervs.reciever.movimentacao.core.documents;

public class Movimentacao {
	private Short posX;
	private Short posY;
	private Float velocidade;
	private Float aceleracao;
	private Float tempo;
	private Boolean pressao;
	private Long jogadorId;
	private Long partidaId;

	public Movimentacao(Short posX, Short posY, Float velocidade, Float aceleracao, Float tempo, Boolean pressao,
			Long jogadorId, Long partidaId) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.velocidade = velocidade;
		this.aceleracao = aceleracao;
		this.tempo = tempo;
		this.pressao = pressao;
		this.jogadorId = jogadorId;
		this.partidaId = partidaId;
	}

	public Movimentacao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Short getPosX() {
		return posX;
	}

	public void setPosX(Short posX) {
		this.posX = posX;
	}

	public Short getPosY() {
		return posY;
	}

	public void setPosY(Short posY) {
		this.posY = posY;
	}

	public Float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(Float velocidade) {
		this.velocidade = velocidade;
	}

	public Float getAceleracao() {
		return aceleracao;
	}

	public void setAceleracao(Float aceleracao) {
		this.aceleracao = aceleracao;
	}

	public Float getTempo() {
		return tempo;
	}

	public void setTempo(Float tempo) {
		this.tempo = tempo;
	}

	public Boolean getPressao() {
		return pressao;
	}

	public void setPressao(Boolean pressao) {
		this.pressao = pressao;
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
