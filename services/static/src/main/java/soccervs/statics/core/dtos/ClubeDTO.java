package soccervs.statics.core.dtos;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ClubeDTO {
	private Short id;
	private String nome;
	private String cidade;
	private String pais;
	private LocalDate dataFundacao;
	private Integer tecnico;
}
