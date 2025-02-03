package soccervs.statics.core.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.RequiredArgsConstructor;
import soccervs.statics.core.entities.enums.EFuncaoPosicao;
import soccervs.statics.core.entities.enums.EPosicoes;

@Entity(name="posicoes")
@Table(name="tb_posicoes")
@RequiredArgsConstructor
public class Posicoes {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Byte id;
	
	@Column(name = "posicao", length = 3) @Enumerated(EnumType.STRING)
	private EPosicoes posicao;
	
	@Column(name = "funcao", length = 20) @Enumerated(EnumType.STRING)
	private EFuncaoPosicao funcao;
	
	@Column(name = "descricao", length = 255)
	private String descricao;
	
	@ManyToOne @JoinColumn(name = "jogador_id", nullable = false)
	private Jogadores jogador;
}
