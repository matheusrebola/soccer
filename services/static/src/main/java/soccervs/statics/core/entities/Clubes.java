package soccervs.statics.core.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_clubes")
public class Clubes {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Short id;
	@Column(length = 100)
	private String nome;
	
	@Column(length = 50)
	private String cidade;
	
	@Column(length = 50)
	private String pais;
	
	@Column(name = "data_fundacao")
	private LocalDate dataFundacao;
	
	@ManyToOne @JoinColumn(name = "tecnico_id", nullable = false)
	private Tecnicos tecnico;
	
}
