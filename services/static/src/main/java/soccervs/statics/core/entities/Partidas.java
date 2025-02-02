package soccervs.statics.core.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.RequiredArgsConstructor;

@Entity(name="partidas")
@Table(name="tb_partidas")
@RequiredArgsConstructor
public class Partidas {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private LocalDateTime dataPartida;
	
	private String localPartida;
	
	private Short timeCasa;
	
	private Short timeFora;
	
	private Byte placarCasa;
	
	private Byte placarVisitante;
	
	private Tecnicos tecnico;
	
	private Jogadores jogador;
	
	private Temporadas temporada;
	
	private Competicoes competicao;
}
