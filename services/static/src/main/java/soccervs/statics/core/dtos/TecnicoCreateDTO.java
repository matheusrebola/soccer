package soccervs.statics.core.dtos;

import java.time.LocalDate;

public class TecnicoCreateDTO {
	private String nome;
	private String nacionalidade;
	private LocalDate nascimento;
	private Byte experiencia;
	private String filosofia;
	
	public TecnicoCreateDTO(String nome, String nacionalidade, LocalDate nascimento, Byte experiencia,
			String filosofia) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.nascimento = nascimento;
		this.experiencia = experiencia;
		this.filosofia = filosofia;
	}

	public TecnicoCreateDTO() {super();}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public Byte getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(Byte experiencia) {
		this.experiencia = experiencia;
	}

	public String getFilosofia() {
		return filosofia;
	}

	public void setFilosofia(String filosofia) {
		this.filosofia = filosofia;
	}
}
