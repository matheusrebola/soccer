package soccervs.reciever.relacaojogadores.core.documents;

import soccervs.reciever.relacaojogadores.core.documents.enums.EInteracao;

public class RelacaoJogadoresCreate {
	private Long j1Id;
	private Long j2Id;
	private EInteracao interacao;
	private Long partidaId;

	public RelacaoJogadoresCreate(Long j1Id, Long j2Id, EInteracao interacao, Long partidaId) {
		super();
		this.j1Id = j1Id;
		this.j2Id = j2Id;
		this.interacao = interacao;
		this.partidaId = partidaId;
	}

	public RelacaoJogadoresCreate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getJ1Id() {
		return j1Id;
	}

	public void setJ1Id(Long j1Id) {
		this.j1Id = j1Id;
	}

	public Long getJ2Id() {
		return j2Id;
	}

	public void setJ2Id(Long j2Id) {
		this.j2Id = j2Id;
	}

	public EInteracao getInteracao() {
		return interacao;
	}

	public void setInteracao(EInteracao interacao) {
		this.interacao = interacao;
	}

	public Long getPartidaId() {
		return partidaId;
	}

	public void setPartidaId(Long partidaId) {
		this.partidaId = partidaId;
	}
}
