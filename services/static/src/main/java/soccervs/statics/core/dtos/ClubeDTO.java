package soccervs.statics.core.dtos;

import java.time.LocalDate;

public class ClubeDTO extends ClubeCreateDTO {
	private String id;

	public ClubeDTO(String nome, String cidade, String pais, LocalDate dataFundacao, Integer tecnico, String id) {
		super(nome, cidade, pais, dataFundacao, tecnico);
		this.id = id;
	}

	public ClubeDTO() {super();}

	public ClubeDTO(String nome, String cidade, String pais, LocalDate dataFundacao, Integer tecnico) {
		super(nome, cidade, pais, dataFundacao, tecnico);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}	
}
