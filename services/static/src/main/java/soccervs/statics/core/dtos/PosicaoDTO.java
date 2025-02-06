package soccervs.statics.core.dtos;

import soccervs.statics.core.entities.enums.EFuncaoPosicao;
import soccervs.statics.core.entities.enums.EPosicoes;

public class PosicaoDTO extends PosicaoCreateDTO {
	private Byte id;

	public PosicaoDTO(EPosicoes posicao, EFuncaoPosicao funcao, String descricao, Long jogador, Byte id) {
		super(posicao, funcao, descricao, jogador);
		this.id = id;
	}

	public PosicaoDTO() {super();}

	public PosicaoDTO(EPosicoes posicao, EFuncaoPosicao funcao, String descricao, Long jogador) {
		super(posicao, funcao, descricao, jogador);
	}

	public Byte getId() {
		return id;
	}

	public void setId(Byte id) {
		this.id = id;
	}
}
