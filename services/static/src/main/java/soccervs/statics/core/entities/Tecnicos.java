package soccervs.statics.core.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_tecnicos")
public class Tecnicos{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "nome_completo", length = 100)
	private String nome;
	
	@Column(name = "nacionalidade", length = 100)
	private String nacionalidade;
	
	@Column(name = "data_nascimento")
	private LocalDate nascimento;
	
	@Column(name = "anos_de_experiencia")
	private Byte experiencia;
	
	@Column(name = "filosofia_geral")
	private String filosofia;

	public Tecnicos(Long id, String nome, String nacionalidade, LocalDate nascimento, Byte experiencia,
			String filosofia) {
		super();
		this.id = id;
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.nascimento = nascimento;
		this.experiencia = experiencia;
		this.filosofia = filosofia;
	}

	public Tecnicos() {super();}

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
