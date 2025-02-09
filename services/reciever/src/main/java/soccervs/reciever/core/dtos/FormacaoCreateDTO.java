package soccervs.reciever.core.dtos;

import soccervs.reciever.core.documents.enums.EFormacao;

public class FormacaoCreateDTO {
	private Float minuto;
	private EFormacao formacao;
	private Long jogadorId;
	private Long partidaId;

	public FormacaoCreateDTO(Float minuto, EFormacao formacao, Long jogadorId, Long partidaId) {
		super();
		this.minuto = minuto;
		this.formacao = formacao;
		this.jogadorId = jogadorId;
		this.partidaId = partidaId;
	}

	public FormacaoCreateDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Float getMinuto() {
		return minuto;
	}

	public void setMinuto(Float minuto) {
		this.minuto = minuto;
	}

	public EFormacao getFormacao() {
		return formacao;
	}

	public void setFormacao(EFormacao formacao) {
		this.formacao = formacao;
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
