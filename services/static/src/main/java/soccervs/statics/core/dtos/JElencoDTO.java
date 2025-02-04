package soccervs.statics.core.dtos;

import lombok.Data;
import soccervs.statics.core.entities.enums.EContribuicao;
import soccervs.statics.core.entities.enums.EFuncaoJogador;
import soccervs.statics.core.entities.enums.EPersonalidade;

@Data
public class JElencoDTO {
	private Integer id;
	private EFuncaoJogador funcao;
	private EContribuicao contribuicao;
	private EPersonalidade personalidade;
	private Integer elenco;
	private Long jogador;
}
