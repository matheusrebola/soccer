package soccervs.statics.core.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_partidas")
public class Partidas {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "data_partida")
	private LocalDateTime dataPartida;
	
	@Column(name = "local_partida", length = 45)
	private String localPartida;
	
	@Column(name = "id_casa")
	private Short casa;
	
	@Column(name = "id_visitante")
	private Short fora;
	
	@Column(name = "placar_casa")
	private Byte placarCasa;
	
	@Column(name = "placar_visitante")
	private Byte placarVisitante;
	
	@ManyToOne @JoinColumn(name = "tecnico_id", nullable = false)
	private Tecnicos tecnico;
	
	@ManyToOne @JoinColumn(name = "temporada_id", nullable = false)
	private Temporadas temporada;
	
	@ManyToOne @JoinColumn(name = "competicao_id", nullable = false)
	private Competicoes competicao;
}
