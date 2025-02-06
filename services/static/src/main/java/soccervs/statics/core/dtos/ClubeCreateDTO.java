package soccervs.statics.core.dtos;

import java.time.LocalDate;

public class ClubeCreateDTO {
	private String nome;
	private String cidade;
	private String pais;
	private LocalDate dataFundacao;
	private Integer tecnico;
	
	public ClubeCreateDTO(String nome, String cidade, String pais, LocalDate dataFundacao, Integer tecnico) {
		this.nome = nome;
		this.cidade = cidade;
		this.pais = pais;
		this.dataFundacao = dataFundacao;
		this.tecnico = tecnico;
	}
	public ClubeCreateDTO() {super();}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public LocalDate getDataFundacao() {
		return dataFundacao;
	}
	public void setDataFundacao(LocalDate dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	public Integer getTecnico() {
		return tecnico;
	}
	public void setTecnico(Integer tecnico) {
		this.tecnico = tecnico;
	}
}
