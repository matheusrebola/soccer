package soccervs.statics.core.dtos;

import lombok.Data;

@Data
public class ResultadoDTO {
	private Long id;
	private Byte jogos;
	private Byte vitorias;
	private Byte empates;
	private Byte derrotas;
	private Byte aproveitamento;
	private Byte marcados;
	private Byte sofridos;
	private Float desempenho;
	private Short competicao;
	private Short clube;
	private Short temporada;
	private Integer titulo;
}
