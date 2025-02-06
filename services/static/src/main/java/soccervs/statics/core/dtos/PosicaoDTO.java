package soccervs.statics.core.dtos;

import soccervs.statics.core.entities.enums.EFuncaoPosicao;
import soccervs.statics.core.entities.enums.EPosicoes;

public class PosicaoDTO extends PosicaoCreateDTO {
	private String id;

	public PosicaoDTO(EPosicoes posicao, EFuncaoPosicao funcao, String descricao, Long jogador, String id) {
		super(posicao, funcao, descricao, jogador);
		this.id = id;
	}

	public PosicaoDTO() {super();}

	public PosicaoDTO(EPosicoes posicao, EFuncaoPosicao funcao, String descricao, Long jogador) {
		super(posicao, funcao, descricao, jogador);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
