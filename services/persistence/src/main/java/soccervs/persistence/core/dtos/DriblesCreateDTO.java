package soccervs.persistence.core.dtos;

public class DriblesCreateDTO {
	private Byte tTotatis;
	private Byte tBemSucedidas;
	private Float efetividade;
	private Long jogadorId;
	private Long partidaId;

	public DriblesCreateDTO(Byte tTotatis, Byte tBemSucedidas, Float efetividade, Long jogadorId, Long partidaId) {
		super();
		this.tTotatis = tTotatis;
		this.tBemSucedidas = tBemSucedidas;
		this.efetividade = efetividade;
		this.jogadorId = jogadorId;
		this.partidaId = partidaId;
	}

	public DriblesCreateDTO() {
	}

	public Byte gettTotatis() {
		return tTotatis;
	}

	public void settTotatis(Byte tTotatis) {
		this.tTotatis = tTotatis;
	}

	public Byte gettBemSucedidas() {
		return tBemSucedidas;
	}

	public void settBemSucedidas(Byte tBemSucedidas) {
		this.tBemSucedidas = tBemSucedidas;
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
