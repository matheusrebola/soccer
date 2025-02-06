package soccervs.statics.core.dtos;

import java.time.LocalDate;

public class ClubeDTO extends ClubeCreateDTO {
	private Long id;

	public ClubeDTO(String nome, String cidade, String pais, LocalDate dataFundacao, Integer tecnico, Long id) {
		super(nome, cidade, pais, dataFundacao, tecnico);
		this.id = id;
	}

	public ClubeDTO() {super();}

	public ClubeDTO(String nome, String cidade, String pais, LocalDate dataFundacao, Integer tecnico) {
		super(nome, cidade, pais, dataFundacao, tecnico);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}	
}
