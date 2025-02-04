package soccervs.statics.core.dtos;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class PartidaDTO {
	private Long id;
	private LocalDateTime dataPartida;
	private String localPartida;
	private Short casa;
	private Short fora;
	private Byte placarCasa;
	private Byte placarVisitante;
	private Integer tecnico;
	private Short temporada;
	private Short competicao;
}
