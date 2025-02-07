package soccervs.persistence.core.entities;

import soccervs.persistence.core.entities.enums.EFinalizacao;
import soccervs.persistence.core.entities.enums.EResultado;

public class Finalizacoes {
	private Long id;
	private Float tempo;
	private EFinalizacao finalizacao;
	private EResultado resultado;
	private Short eixoX;
	private Short eixoY;
	private Float expectativaGol;

	public Finalizacoes(Long id, Float tempo, EFinalizacao finalizacao, EResultado resultado, Short eixoX, Short eixoY,
			Float expectativaGol) {
		super();
		this.id = id;
		this.tempo = tempo;
		this.finalizacao = finalizacao;
		this.resultado = resultado;
		this.eixoX = eixoX;
		this.eixoY = eixoY;
		this.expectativaGol = expectativaGol;
	}

	public Finalizacoes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

}
