package soccervs.statics.core.entities;

import java.time.Year;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.RequiredArgsConstructor;

@Entity(name="elencos")
@Table(name="tb_elencos")
@RequiredArgsConstructor
public class Elencos {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "nome_do_elenco")
	private String nome;
	
	@Column(name = "ano_formacao")
	private Year anoFormacao;
	
	@Column(name = "tecnico_responsavel")
	private String tecnicoResponsavel;
	
	@ManyToOne @JoinColumn(name = "tecnico_id", nullable = false)
	private Tecnicos tecnico;
	
	@ManyToOne @JoinColumn(name = "clube_id", nullable = false)
	private Clubes clube;
	
	@ManyToOne @JoinColumn(name = "temporada_id", nullable = false)
	private Temporadas temporada;
	
	@OneToMany(mappedBy = "elencos")
	private JogadoresElenco jogadoresElenco;
}
