package soccervs.statics.core.dtos;

import java.time.LocalDate;

public class ClubeDTO extends ClubeCreateDTO {
	private Short id;

	public ClubeDTO(String nome, String cidade, String pais, LocalDate dataFundacao, Integer tecnico, Short id) {
		super(nome, cidade, pais, dataFundacao, tecnico);
		this.id = id;
	}

	public ClubeDTO() {super();}

	public ClubeDTO(String nome, String cidade, String pais, LocalDate dataFundacao, Integer tecnico) {
		super(nome, cidade, pais, dataFundacao, tecnico);
	}

	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}	
}
