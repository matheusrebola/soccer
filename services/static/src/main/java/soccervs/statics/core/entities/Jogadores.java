package soccervs.statics.core.entities;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import soccervs.statics.core.entities.enums.EPePreferido;

@Entity
@Table(name="tb_jogadores")
public class Jogadores {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "nome_completo")
	private String nome;
	
	@Column(name = "data_nascimento")
	private LocalDate dataNascimento;
	
	@Column
	private String nacionalidade;
	
	@Column @Enumerated(EnumType.STRING)
	private EPePreferido pePreferido;
	
	@Column
	private Byte altura;
	
	@Column
	private Byte peso;
	
	@OneToMany(mappedBy = "jogadores")
	private Set<Posicoes> posicao;
	
	@OneToMany(mappedBy = "jogadores")
	private Set<Partidas> partida;
	
	@OneToMany(mappedBy = "jogadores")
	private Set<JogadoresElenco> jogadoresElenco;
}
