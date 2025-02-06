package soccervs.statics.core.dtos;

import soccervs.statics.core.entities.enums.EFuncaoPosicao;
import soccervs.statics.core.entities.enums.EPosicoes;

public class PosicaoDTO extends PosicaoCreateDTO {
	private Long id;

	public PosicaoDTO(EPosicoes posicao, EFuncaoPosicao funcao, String descricao, Long jogador, Long id) {
		super(posicao, funcao, descricao, jogador);
		this.id = id;
	}

	public PosicaoDTO() {super();}

	public PosicaoDTO(EPosicoes posicao, EFuncaoPosicao funcao, String descricao, Long jogador) {
		super(posicao, funcao, descricao, jogador);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
