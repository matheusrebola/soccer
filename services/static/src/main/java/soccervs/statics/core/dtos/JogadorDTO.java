package soccervs.statics.core.dtos;

import java.time.LocalDate;

import soccervs.statics.core.entities.enums.EPePreferido;

public class JogadorDTO extends JogadorCreateDTO {
	private String id;

	public JogadorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JogadorDTO(String nome, LocalDate dataNascimento, String nacionalidade, EPePreferido pePreferido,
			Float altura, Float peso) {
		super(nome, dataNascimento, nacionalidade, pePreferido, altura, peso);
		// TODO Auto-generated constructor stub
	}

	public JogadorDTO(String nome, LocalDate dataNascimento, String nacionalidade, EPePreferido pePreferido,
			Float altura, Float peso, String id) {
		super(nome, dataNascimento, nacionalidade, pePreferido, altura, peso);
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
