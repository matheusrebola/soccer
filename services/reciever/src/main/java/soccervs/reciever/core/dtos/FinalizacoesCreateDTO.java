package soccervs.reciever.core.dtos;

import soccervs.reciever.core.documents.enums.EFinalizacao;
import soccervs.reciever.core.documents.enums.EResultado;

public class FinalizacoesCreateDTO {
	private Float tempo;
	private EFinalizacao finalizacao;
	private EResultado resultado;
	private Short eixoX;
	private Short eixoY;
	private Float expectativaGol;
	private Long jogadorId;
	private Long partidaId;

	public FinalizacoesCreateDTO(Float tempo, EFinalizacao finalizacao, EResultado resultado, Short eixoX, Short eixoY,
			Float expectativaGol, Long jogadorId, Long partidaId) {
		super();
		this.tempo = tempo;
		this.finalizacao = finalizacao;
		this.resultado = resultado;
		this.eixoX = eixoX;
		this.eixoY = eixoY;
		this.expectativaGol = expectativaGol;
		this.jogadorId = jogadorId;
		this.partidaId = partidaId;
	}

	public FinalizacoesCreateDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Float getTempo() {
		return tempo;
	}

	public void setTempo(Float tempo) {
		this.tempo = tempo;
	}

	public EFinalizacao getFinalizacao() {
		return finalizacao;
	}

	public void setFinalizacao(EFinalizacao finalizacao) {
		this.finalizacao = finalizacao;
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

	public Float getExpectativaGol() {
		return expectativaGol;
	}

	public void setExpectativaGol(Float expectativaGol) {
		this.expectativaGol = expectativaGol;
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
