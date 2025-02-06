package soccervs.statics.core.dtos;

import soccervs.statics.core.entities.enums.EFuncaoPosicao;
import soccervs.statics.core.entities.enums.EPosicoes;

public class PosicaoCreateDTO {
	private EPosicoes posicao;
	private EFuncaoPosicao funcao;
	private String descricao;
	private Long jogador;
	
	public PosicaoCreateDTO(EPosicoes posicao, EFuncaoPosicao funcao, String descricao, Long jogador) {
		super();
		this.posicao = posicao;
		this.funcao = funcao;
		this.descricao = descricao;
		this.jogador = jogador;
	}

	public PosicaoCreateDTO() {super();}

	public EPosicoes getPosicao() {
		return posicao;
	}

	public void setPosicao(EPosicoes posicao) {
		this.posicao = posicao;
	}

	public EFuncaoPosicao getFuncao() {
		return funcao;
	}

	public void setFuncao(EFuncaoPosicao funcao) {
		this.funcao = funcao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getJogador() {
		return jogador;
	}

	public void setJogador(Long jogador) {
		this.jogador = jogador;
	}
}
