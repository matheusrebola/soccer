package soccervs.statics.core.dtos;

import java.time.LocalDate;

public class TecnicoDTO extends TecnicoCreateDTO {
	private String id;

	public TecnicoDTO(String nome, String nacionalidade, LocalDate nascimento, Byte experiencia, String filosofia,
			String id) {
		super(nome, nacionalidade, nascimento, experiencia, filosofia);
		this.id = id;
	}

	public TecnicoDTO() {super();}

	public TecnicoDTO(String nome, String nacionalidade, LocalDate nascimento, Byte experiencia, String filosofia) {
		super(nome, nacionalidade, nascimento, experiencia, filosofia);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
