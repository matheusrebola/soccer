package soccervs.statics.core.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	
	private EPosicoes posicao;
	
	private EFuncaoPosicao funcao;
	
	private String descricao;
	
	private Jogadores jogador;
}
