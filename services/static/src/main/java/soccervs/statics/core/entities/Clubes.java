package soccervs.statics.core.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_clubes")
public class Clubes {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length = 100, nullable = false)
	private String nome;
	
	@Column(length = 50, nullable = false)
	private String cidade;
	
	@Column(length = 50, nullable = false)
	private String pais;
	
	@Column(name = "data_fundacao", nullable = false)
	private LocalDate dataFundacao;
	
	@Column(name = "tecnico_id", nullable = false)
	private Integer tecnico;
	
	public Clubes(Long id, String nome, String cidade, String pais, LocalDate dataFundacao, Integer tecnico) {
		super();
		this.id = id;
		this.nome = nome;
		this.cidade = cidade;
		this.pais = pais;
		this.dataFundacao = dataFundacao;
		this.tecnico = tecnico;
	}

	public Clubes() {super();}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
