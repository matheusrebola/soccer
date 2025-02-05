package soccervs.statics.core.dtos;

import java.time.LocalDate;

import lombok.Data;

@Data
public class TecnicoCreateDTO {
	private String nome;
	private String nacionalidade;
	private LocalDate nascimento;
	private Byte experiencia;
	private String filosofia;
}
