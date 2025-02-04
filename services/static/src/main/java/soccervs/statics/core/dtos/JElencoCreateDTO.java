package soccervs.statics.core.dtos;

import lombok.Data;
import soccervs.statics.core.entities.enums.EContribuicao;
import soccervs.statics.core.entities.enums.EFuncaoJogador;
import soccervs.statics.core.entities.enums.EPersonalidade;

@Data
public class JElencoCreateDTO {
	private EFuncaoJogador funcao;
	private EContribuicao contribuicao;
	private EPersonalidade personalidade;
	private Integer elenco;
	private Long jogador;
}
