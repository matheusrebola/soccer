package soccervs.persistence.core.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import soccervs.persistence.core.entities.enums.EAcaoDef;

@Entity
@Table(name="tb_acoes_defensivas")
public class AcoesDefensivas {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Enumerated(EnumType.STRING)
	private EAcaoDef acao;
	private Byte tentativasT;
	private Byte tBemSucedidas;
	private Float efetividade;
	private Long jogadorId;
	private Long partidaId;

	public AcoesDefensivas(Long id, EAcaoDef acao, Byte tentativasT, Byte tBemSucedidas, Float efetividade,
			Long jogadorId, Long partidaId) {
		super();
		this.id = id;
		this.acao = acao;
		this.tentativasT = tentativasT;
		this.tBemSucedidas = tBemSucedidas;
		this.efetividade = efetividade;
		this.jogadorId = jogadorId;
		this.partidaId = partidaId;
	}

	public AcoesDefensivas() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EAcaoDef getAcao() {
		return acao;
	}

	public void setAcao(EAcaoDef acao) {
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
