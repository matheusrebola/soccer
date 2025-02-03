package soccervs.statics.core.entities;

import java.time.Year;
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
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity(name="temporadas")
@Table(name="tb_temporadas")
@Getter
@Setter
@RequiredArgsConstructor
public class Temporadas {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Short id;
	
	@Column(length = 5)
	private String temporada;
	
	@Column(name = "data_inicio")
	private Year dataInicio;
	
	@Column(name = "data_fim")
	private Year dataFim;
	
	@ManyToOne @JoinColumn(name = "competicao_id", nullable = false)
	private Competicoes competicao;
	
	@OneToMany(mappedBy = "temporadas")
	private Set<Elencos> elenco;
	
	@OneToMany(mappedBy = "temporadas")
	private Set<Partidas> partida;
}
