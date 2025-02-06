package soccervs.statics.core.dtos;

import soccervs.statics.core.entities.enums.EContribuicao;
import soccervs.statics.core.entities.enums.EFuncaoJogador;
import soccervs.statics.core.entities.enums.EPersonalidade;

public class JElencoDTO extends JElencoCreateDTO {
	private Integer id;

	public JElencoDTO(EFuncaoJogador funcao, EContribuicao contribuicao, EPersonalidade personalidade, Integer elenco,
			Long jogador, Integer id) {
		super(funcao, contribuicao, personalidade, elenco, jogador);
		this.id = id;
	}

	public JElencoDTO() {super();}

	public JElencoDTO(EFuncaoJogador funcao, EContribuicao contribuicao, EPersonalidade personalidade, Integer elenco,
			Long jogador) {
		super(funcao, contribuicao, personalidade, elenco, jogador);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
