package soccervs.statics.core.dtos;

import java.time.LocalDate;

import soccervs.statics.core.entities.enums.EPePreferido;

public class JogadorCreateDTO {
	private String nome;
	private LocalDate dataNascimento;
	private String nacionalidade;
	private EPePreferido pePreferido;
	private Float altura;
	private Float peso;
	
	public JogadorCreateDTO(String nome, LocalDate dataNascimento, String nacionalidade, EPePreferido pePreferido,
			Float altura, Float peso) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.nacionalidade = nacionalidade;
		this.pePreferido = pePreferido;
		this.altura = altura;
		this.peso = peso;

	}
	
	public JogadorCreateDTO() {super();}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public EPePreferido getPePreferido() {
		return pePreferido;
	}
	public void setPePreferido(EPePreferido pePreferido) {
		this.pePreferido = pePreferido;
	}
	public Float getAltura() {
		return altura;
	}
	public void setAltura(Float altura) {
		this.altura = altura;
	}
	public Float getPeso() {
		return peso;
	}
	public void setPeso(Float peso) {
		this.peso = peso;
	}
}
