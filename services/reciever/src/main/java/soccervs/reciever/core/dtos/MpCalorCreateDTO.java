package soccervs.reciever.core.dtos;

import soccervs.reciever.core.documents.enums.EZona;

public class MpCalorCreateDTO {
	private EZona zona;
	private Float percentual;
	private Long jogadorId;
	private Long partidaId;

	public MpCalorCreateDTO(EZona zona, Float percentual, Long jogadorId, Long partidaId) {
		super();
		this.zona = zona;
		this.percentual = percentual;
		this.jogadorId = jogadorId;
		this.partidaId = partidaId;
	}

	public MpCalorCreateDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EZona getZona() {
		return zona;
	}

	public void setZona(EZona zona) {
		this.zona = zona;
	}

	public Float getPercentual() {
		return percentual;
	}

	public void setPercentual(Float percentual) {
		this.percentual = percentual;
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
