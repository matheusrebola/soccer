package soccervs.reciever.formacao.core.documents;

import soccervs.reciever.formacao.core.documents.enums.EFormacao;
import soccervs.reciever.formacao.core.documents.enums.EModoJogo;

public class FormacaoCreate {
	private Float tempoJogo;
	private EFormacao formacao;
	private EModoJogo modoJogo;
	private Float compactacao;
	private Long timeId;
	private Long partidaId;

	public FormacaoCreate(Float tempoJogo, EFormacao formacao, EModoJogo modoJogo, Float compactacao, Long timeId,
			Long partidaId) {
		super();
		this.tempoJogo = tempoJogo;
		this.formacao = formacao;
		this.modoJogo = modoJogo;
		this.compactacao = compactacao;
		this.timeId = timeId;
		this.partidaId = partidaId;
	}

	public FormacaoCreate() {
		super();
	}

	public Float getTempoJogo() {
		return tempoJogo;
	}

	public void setTempoJogo(Float tempoJogo) {
		this.tempoJogo = tempoJogo;
	}

	public EFormacao getFormacao() {
		return formacao;
	}

	public void setFormacao(EFormacao formacao) {
		this.formacao = formacao;
	}

	public EModoJogo getModoJogo() {
		return modoJogo;
	}

	public void setModoJogo(EModoJogo modoJogo) {
		this.modoJogo = modoJogo;
	}

	public Float getCompactacao() {
		return compactacao;
	}

	public void setCompactacao(Float compactacao) {
		this.compactacao = compactacao;
	}

	public Long getTimeId() {
		return timeId;
	}

	public void setTimeId(Long timeId) {
		this.timeId = timeId;
	}

	public Long getPartidaId() {
		return partidaId;
	}

	public void setPartidaId(Long partidaId) {
		this.partidaId = partidaId;
	}

}
