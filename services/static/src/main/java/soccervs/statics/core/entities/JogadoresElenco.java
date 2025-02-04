package soccervs.statics.core.entities;

import jakarta.persistence.CascadeType;
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
import soccervs.statics.core.entities.enums.EContribuicao;
import soccervs.statics.core.entities.enums.EFuncaoJogador;
import soccervs.statics.core.entities.enums.EPersonalidade;

@Entity
@Table(name="tb_jogadores_no_elenco")
public class JogadoresElenco {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column @Enumerated(EnumType.STRING)
	private EFuncaoJogador funcao;
	
	@Column @Enumerated(EnumType.STRING)
	private EContribuicao contribuicao;
	
	@Column @Enumerated(EnumType.STRING)
	private EPersonalidade personalidade;
	
	@ManyToOne(cascade = CascadeType.ALL) @JoinColumn(name = "elenco_id", nullable = false)
	private Elencos elenco;
	
	@ManyToOne(cascade = CascadeType.ALL) @JoinColumn(name = "jogador_id", nullable = false)
	private Jogadores jogador;
}
