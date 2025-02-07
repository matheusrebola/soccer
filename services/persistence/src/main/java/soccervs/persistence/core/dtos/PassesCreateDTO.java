package soccervs.persistence.core.dtos;

import soccervs.persistence.core.entities.enums.EPasse;

public class PassesCreateDTO {
	private EPasse passe;
	private Byte tTotatis;
	private Byte tBemSuce;
	private Float efetividade;
	private Long jogadorId;
	private Long partidaId;

	public PassesCreateDTO(EPasse passe, Byte tTotatis, Byte tBemSuce, Float efetividade, Long jogadorId,
			Long partidaId) {
		super();
		this.passe = passe;
		this.tTotatis = tTotatis;
		this.tBemSuce = tBemSuce;
		this.efetividade = efetividade;
		this.jogadorId = jogadorId;
		this.partidaId = partidaId;
	}

	public PassesCreateDTO() {}

	public EPasse getPasse() {
		return passe;
	}

	public void setPasse(EPasse passe) {
		this.passe = passe;
	}

	public Byte gettTotatis() {
		return tTotatis;
	}

	public void settTotatis(Byte tTotatis) {
		this.tTotatis = tTotatis;
	}

	public Byte gettBemSuce() {
		return tBemSuce;
	}

	public void settBemSuce(Byte tBemSuce) {
		this.tBemSuce = tBemSuce;
	}

	public Float getEfetividade() {
		return efetividade;
	}

	public void setEfetividade(Float efetividade) {
		this.efetividade = efetividade;
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
