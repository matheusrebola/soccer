package soccervs.statics.core.dtos;

import soccervs.statics.core.entities.enums.EContribuicao;
import soccervs.statics.core.entities.enums.EFuncaoJogador;
import soccervs.statics.core.entities.enums.EPersonalidade;

public class JElencoDTO extends JElencoCreateDTO {
	private Long id;

	public JElencoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JElencoDTO(EFuncaoJogador funcao, EContribuicao contribuicao, EPersonalidade personalidade, Long elenco,
			Long jogador) {
		super(funcao, contribuicao, personalidade, elenco, jogador);
		// TODO Auto-generated constructor stub
	}

	public JElencoDTO(EFuncaoJogador funcao, EContribuicao contribuicao, EPersonalidade personalidade, Long elenco,
			Long jogador, Long id) {
		super(funcao, contribuicao, personalidade, elenco, jogador);
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
