package soccervs.statics.core.dtos;

import java.time.LocalDate;

public class TecnicoDTO extends TecnicoCreateDTO {
	private Long id;

	public TecnicoDTO(String nome, String nacionalidade, LocalDate nascimento, Byte experiencia, String filosofia,
			Long id) {
		super(nome, nacionalidade, nascimento, experiencia, filosofia);
		this.id = id;
	}

	public TecnicoDTO() {super();}

	public TecnicoDTO(String nome, String nacionalidade, LocalDate nascimento, Byte experiencia, String filosofia) {
		super(nome, nacionalidade, nascimento, experiencia, filosofia);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
