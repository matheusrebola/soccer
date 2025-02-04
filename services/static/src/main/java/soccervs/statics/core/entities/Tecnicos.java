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
	private Integer id;
	
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
	
}
