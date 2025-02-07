package soccervs.statics.core.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import soccervs.statics.core.entities.enums.EFuncaoPosicao;
import soccervs.statics.core.entities.enums.EPosicoes;

@Entity
@Table(name="tb_posicoes")
public class Posicoes {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "posicao", length = 3) @Enumerated(EnumType.STRING)
	private EPosicoes posicao;
	
	@Column(name = "funcao", length = 20) @Enumerated(EnumType.STRING)
	private EFuncaoPosicao funcao;
	
	@Column(name = "descricao", length = 255)
	private String descricao;
	
	@Column(name = "jogador_id", nullable = false)
	private Long jogador;

	public Posicoes(Long id, EPosicoes posicao, EFuncaoPosicao funcao, String descricao, Long jogador) {
		super();
		this.id = id;
		this.posicao = posicao;
		this.funcao = funcao;
		this.descricao = descricao;
		this.jogador = jogador;
	}

	public Posicoes() {super();}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
