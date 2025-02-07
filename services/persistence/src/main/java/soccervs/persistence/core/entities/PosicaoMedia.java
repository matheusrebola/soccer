package soccervs.persistence.core.entities;

public class PosicaoMedia {
	private Long id;
	private Short eixoX;
	private Short eixoY;
	private Long partidaId;
	private Long jogadorId;

	public PosicaoMedia(Long id, Short eixoX, Short eixoY, Long partidaId, Long jogadorId) {
		super();
		this.id = id;
		this.eixoX = eixoX;
		this.eixoY = eixoY;
		this.partidaId = partidaId;
		this.jogadorId = jogadorId;
	}

	public PosicaoMedia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
