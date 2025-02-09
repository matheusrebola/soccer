package soccervs.reciever.core.dtos;

public class PosicaoMCreateDTO {
	private Short eixoX;
	private Short eixoY;
	private Long partidaId;
	private Long jogadorId;

	public PosicaoMCreateDTO(Short eixoX, Short eixoY, Long partidaId, Long jogadorId) {
		super();
		this.eixoX = eixoX;
		this.eixoY = eixoY;
		this.partidaId = partidaId;
		this.jogadorId = jogadorId;
	}

	public PosicaoMCreateDTO() {
		super();
		// TODO Auto-generated constructor stub
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
