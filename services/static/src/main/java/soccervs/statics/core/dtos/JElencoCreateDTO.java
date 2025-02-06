package soccervs.statics.core.dtos;
import soccervs.statics.core.entities.enums.EContribuicao;
import soccervs.statics.core.entities.enums.EFuncaoJogador;
import soccervs.statics.core.entities.enums.EPersonalidade;

public class JElencoCreateDTO {
	private EFuncaoJogador funcao;
	private EContribuicao contribuicao;
	private EPersonalidade personalidade;
	private Long elenco;
	private Long jogador;
	
	public JElencoCreateDTO(EFuncaoJogador funcao, EContribuicao contribuicao, EPersonalidade personalidade,
			Long elenco, Long jogador) {
		super();
		this.funcao = funcao;
		this.contribuicao = contribuicao;
		this.personalidade = personalidade;
		this.elenco = elenco;
		this.jogador = jogador;
	}

	public JElencoCreateDTO() {super();}

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
