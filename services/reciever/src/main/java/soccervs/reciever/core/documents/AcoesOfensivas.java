package soccervs.reciever.core.documents;

import soccervs.reciever.core.documents.enums.EAcaoOf;

public class AcoesOfensivas {
	private Long id;
	private EAcaoOf acao;
	private Byte tentativasT;
	private Byte tBemSucedidas;
	private Float efetividade;
	private Long jogadorId;
	private Long partidaId;
	
	public AcoesOfensivas(Long id, EAcaoOf acao, Byte tentativasT, Byte tBemSucedidas, Float efetividade, Long jogadorId,
			Long partidaId) {
		super();
		this.id = id;
		this.acao = acao;
		this.tentativasT = tentativasT;
		this.tBemSucedidas = tBemSucedidas;
		this.efetividade = efetividade;
		this.jogadorId = jogadorId;
		this.partidaId = partidaId;
	}

	public AcoesOfensivas() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EAcaoOf getAcao() {
		return acao;
	}

	public void setAcao(EAcaoOf acao) {
		this.acao = acao;
	}

	public Byte getTentativasT() {
		return tentativasT;
	}

	public void setTentativasT(Byte tentativasT) {
		this.tentativasT = tentativasT;
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
