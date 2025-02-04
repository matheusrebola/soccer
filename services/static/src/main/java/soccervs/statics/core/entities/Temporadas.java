package soccervs.statics.core.entities;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_temporadas")
public class Temporadas {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Short id;
	
	@Column(length = 5)
	private String temporada;
	
	@Column(name = "data_inicio")
	private Short dataInicio;
	
	@Column(name = "data_fim")
	private Short dataFim;
	
	@ManyToOne @JoinColumn(name = "competicao_id", nullable = false)
	private Competicoes competicao;
	
	@OneToMany(mappedBy = "temporada")
	private Set<Elencos> elenco;
	
	@OneToMany(mappedBy = "temporada")
	private Set<Partidas> partida;
}
