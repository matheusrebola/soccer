package soccervs.statics.core.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import soccervs.statics.core.entities.enums.EContribuicao;
import soccervs.statics.core.entities.enums.EFuncaoJogador;
import soccervs.statics.core.entities.enums.EPersonalidade;

@Entity
@Table(name="tb_jogadores_no_elenco")
public class JogadoresElenco {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column @Enumerated(EnumType.STRING)
	private EFuncaoJogador funcao;
	
	@Column @Enumerated(EnumType.STRING)
	private EContribuicao contribuicao;
	
	@Column @Enumerated(EnumType.STRING)
	private EPersonalidade personalidade;
	
	@Column(name = "elenco_id", nullable = false)
	private Long elenco;
	
	@Column(name = "jogador_id", nullable = false)
	private Long jogador;

	public JogadoresElenco(Long id, EFuncaoJogador funcao, EContribuicao contribuicao, EPersonalidade personalidade,
			Long elenco, Long jogador) {
		super();
		this.id = id;
		this.funcao = funcao;
		this.contribuicao = contribuicao;
		this.personalidade = personalidade;
		this.elenco = elenco;
		this.jogador = jogador;
	}

	public JogadoresElenco() {super();}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EFuncaoJogador getFuncao() {
		return funcao;
	}

	public void setFuncao(EFuncaoJogador funcao) {
		this.funcao = funcao;
	}

	public EContribuicao getContribuicao() {
		return contribuicao;
	}

	public void setContribuicao(EContribuicao contribuicao) {
		this.contribuicao = contribuicao;
	}

	public EPersonalidade getPersonalidade() {
		return personalidade;
	}

	public void setPersonalidade(EPersonalidade personalidade) {
		this.personalidade = personalidade;
	}

	public Long getElenco() {
		return elenco;
	}

	public void setElenco(Long elenco) {
		this.elenco = elenco;
	}

	public Long getJogador() {
		return jogador;
	}

	public void setJogador(Long jogador) {
		this.jogador = jogador;
	}
}
