package soccervs.statics.core.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_resultados")
public class Resultados {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "jogos_disputados")
	private Byte jogos;
	
	@Column
	private Byte vitorias;
	
	@Column
	private Byte empates;
	
	@Column
	private Byte derrotas;
	
	@Column(name = "aproveitamento_geral")
	private Byte aproveitamento;
	
	@Column(name = "gols_marcados")
	private Byte marcados;
	
	@Column(name = "gols_sofridos")
	private Byte sofridos;
	
	@Column
	private Byte desempenho;
	
	@ManyToOne @JoinColumn(name = "competicao_id", nullable = false)
	private Competicoes competicao;
	
	@ManyToOne @JoinColumn(name = "clube_id", nullable = false)
	private Clubes clube;
	
	@ManyToOne @JoinColumn(name = "temporada_id", nullable = false)
	private Temporadas temporada;
	
	@ManyToOne @JoinColumn(name = "titulo_id", nullable = false)
	private Titulos titulo;
}
