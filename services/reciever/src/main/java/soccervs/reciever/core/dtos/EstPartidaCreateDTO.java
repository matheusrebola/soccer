package soccervs.reciever.core.dtos;

public class EstPartidaCreateDTO {
	private Byte minJogados;
	private Byte gols;
	private Byte assist;
	private Float veloMed;
	private Float disPercorrida;
	private Float pontuacao;
	private Long jogadorId;
	private Long partidaId;

	public EstPartidaCreateDTO(Byte minJogados, Byte gols, Byte assist, Float veloMed, Float disPercorrida,
			Float pontuacao, Long jogadorId, Long partidaId) {
		super();
		this.minJogados = minJogados;
		this.gols = gols;
		this.assist = assist;
		this.veloMed = veloMed;
		this.disPercorrida = disPercorrida;
		this.pontuacao = pontuacao;
		this.jogadorId = jogadorId;
		this.partidaId = partidaId;
	}

	public EstPartidaCreateDTO() {
	}

	public Byte getMinJogados() {
		return minJogados;
	}

	public void setMinJogados(Byte minJogados) {
		this.minJogados = minJogados;
	}

	public Byte getGols() {
		return gols;
	}

	public void setGols(Byte gols) {
		this.gols = gols;
	}

	public Byte getAssist() {
		return assist;
	}

	public void setAssist(Byte assist) {
		this.assist = assist;
	}

	public Float getVeloMed() {
		return veloMed;
	}

	public void setVeloMed(Float veloMed) {
		this.veloMed = veloMed;
	}

	public Float getDisPercorrida() {
		return disPercorrida;
	}

	public void setDisPercorrida(Float disPercorrida) {
		this.disPercorrida = disPercorrida;
	}

	public Float getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(Float pontuacao) {
		this.pontuacao = pontuacao;
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
