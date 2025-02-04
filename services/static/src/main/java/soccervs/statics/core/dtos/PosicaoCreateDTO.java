package soccervs.statics.core.dtos;

import lombok.Data;
import soccervs.statics.core.entities.enums.EFuncaoPosicao;
import soccervs.statics.core.entities.enums.EPosicoes;

@Data
public class PosicaoCreateDTO {
private EPosicoes posicao;
	private EFuncaoPosicao funcao;
	private String descricao;
	private Long jogador;
}
