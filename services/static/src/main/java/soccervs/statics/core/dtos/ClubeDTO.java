package soccervs.statics.core.dtos;

import lombok.Data;

@Data
public class ClubeDTO {
	private Short id;
	private String nome;
	private String cidade;
	private String pais;
	private String dataFundacao;
	private Integer tecnico;
}
