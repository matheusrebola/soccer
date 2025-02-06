package soccervs.statics.core.dtos;

import java.time.LocalDate;

public class TecnicoDTO extends TecnicoCreateDTO {
	private Integer id;

	public TecnicoDTO(String nome, String nacionalidade, LocalDate nascimento, Byte experiencia, String filosofia,
			Integer id) {
		super(nome, nacionalidade, nascimento, experiencia, filosofia);
		this.id = id;
	}

	public TecnicoDTO() {super();}

	public TecnicoDTO(String nome, String nacionalidade, LocalDate nascimento, Byte experiencia, String filosofia) {
		super(nome, nacionalidade, nascimento, experiencia, filosofia);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
