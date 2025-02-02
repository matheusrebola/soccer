package soccervs.statics.core.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.RequiredArgsConstructor;

@Entity(name="clubes")
@Table(name="tb_clubes")
@RequiredArgsConstructor
public class Clubes {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Short id;
	@Column(length = 100)
	private String nome;
	
	@Column(length = 50)
	private String cidade;
	
	@Column(length = 50)
	private String pais;
	
	@Column(length = 10)
	private String dataFundacao;
	
	@ManyToOne @JoinColumn(name = "tecnico", nullable = false)
	private Tecnicos tecnico;
	
}
