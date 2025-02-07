package soccervs.statics.core.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_elencos")
public class Elencos {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "nome_do_elenco")
	private String nome;
	
	@Column(name = "ano_formacao")
	private Short anoFormacao;
	
	@Column(name = "tecnico_responsavel")
	private String tecnicoResponsavel;
	
	@Column(name = "tecnico_id", nullable = false)
	private Long tecnico;
	
	@Column(name = "clube_id", nullable = false)
	private Long clube;
	
	@Column(name = "temporada_id", nullable = false)
	private Long temporada;

	public Elencos(Long id, String nome, Short anoFormacao, String tecnicoResponsavel, Long tecnico,
			Long clube, Long temporada) {
		super();
		this.id = id;
		this.nome = nome;
		this.anoFormacao = anoFormacao;
		this.tecnicoResponsavel = tecnicoResponsavel;
		this.tecnico = tecnico;
		this.clube = clube;
		this.temporada = temporada;
	}

	public Elencos() {}

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

	public Short getAnoFormacao() {
		return anoFormacao;
	}

	public void setAnoFormacao(Short anoFormacao) {
		this.anoFormacao = anoFormacao;
	}

	public String getTecnicoResponsavel() {
		return tecnicoResponsavel;
	}

	public void setTecnicoResponsavel(String tecnicoResponsavel) {
		this.tecnicoResponsavel = tecnicoResponsavel;
	}

	public Long getTecnico() {
		return tecnico;
	}

	public void setTecnico(Long tecnico) {
		this.tecnico = tecnico;
	}

	public Long getClube() {
		return clube;
	}

	public void setClube(Long clube) {
		this.clube = clube;
	}

	public Long getTemporada() {
		return temporada;
	}

	public void setTemporada(Long temporada) {
		this.temporada = temporada;
	}
}
