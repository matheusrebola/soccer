package soccervs.statics.core.dtos;

import lombok.Data;
import soccervs.statics.core.entities.enums.EFuncaoPosicao;

@Data
public class PosicaoDTO {
	private Byte id;
	private EFuncaoPosicao funcao;
	private String descricao;
	private Long jogador;
}
