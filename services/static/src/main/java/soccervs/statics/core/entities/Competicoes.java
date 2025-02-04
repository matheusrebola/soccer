package soccervs.statics.core.entities;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import soccervs.statics.core.entities.enums.ECompeticao;
import soccervs.statics.core.entities.enums.EDisputa;

@Entity
@Table(name="tb_competicoes")
public class Competicoes {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Short id;
	
	@Column(length = 50)
	private String nome;
	
	@Column
	private Short ano;
	
	@Column(name = "tipo_competicao") @Enumerated(EnumType.STRING)
	private ECompeticao tipoCompeticao;
	
	@Column(name = "tipo_disputa") @Enumerated(EnumType.STRING)
	private EDisputa tipoDisputa;
	
	@Column(name = "pais_ou_regiao", length = 50)
	private String paisRegiao;
	
	@OneToMany(mappedBy = "competicoes")
	private Set<Titulos> titulo;
	
	@OneToMany(mappedBy = "competicoes")
	private Set<Temporadas> temporada;
	
	@OneToMany(mappedBy = "competicoes")
	private Set<Resultados> resultado;
	
	@OneToMany(mappedBy = "competicoes")
	private Set<Partidas> partida;
}
