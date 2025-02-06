package soccervs.statics.core.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import soccervs.statics.core.entities.enums.EPePreferido;

@Entity
@Table(name="tb_jogadores")
public class Jogadores {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "nome_completo")
	private String nome;
	
	@Column(name = "data_nascimento")
	private LocalDate dataNascimento;
	
	@Column
	private String nacionalidade;
	
	@Column @Enumerated(EnumType.STRING)
	private EPePreferido pePreferido;
	
	@Column
	private Float altura;
	
	@Column
	private Float peso;
	
	public Jogadores(Long id, String nome, LocalDate dataNascimento, String nacionalidade, EPePreferido pePreferido,
			Float altura, Float peso) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.nacionalidade = nacionalidade;
		this.pePreferido = pePreferido;
		this.altura = altura;
		this.peso = peso;
	}

	public Jogadores() {super();}

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
