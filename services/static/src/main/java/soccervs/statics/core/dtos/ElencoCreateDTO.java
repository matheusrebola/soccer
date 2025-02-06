package soccervs.statics.core.dtos;

import java.util.Set;

public class ElencoCreateDTO {
	private String nome;
	private Short anoFormacao;
	private String tecnicoResponsavel;
	private Integer tecnico;
	private Short clube;
	private Short temporada;
	private Set<Integer> jogadoresElenco;
	
	public ElencoCreateDTO(String nome, Short anoFormacao, String tecnicoResponsavel, Integer tecnico, Short clube,
			Short temporada, Set<Integer> jogadoresElenco) {
		super();
		this.nome = nome;
		this.anoFormacao = anoFormacao;
		this.tecnicoResponsavel = tecnicoResponsavel;
		this.tecnico = tecnico;
		this.clube = clube;
		this.temporada = temporada;
		this.jogadoresElenco = jogadoresElenco;
	}

	public ElencoCreateDTO() {super();}

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

	public Integer getTecnico() {
		return tecnico;
	}

	public void setTecnico(Integer tecnico) {
		this.tecnico = tecnico;
	}

	public Short getClube() {
		return clube;
	}

	public void setClube(Short clube) {
		this.clube = clube;
	}

	public Short getTemporada() {
		return temporada;
	}

	public void setTemporada(Short temporada) {
		this.temporada = temporada;
	}

	public Set<Integer> getJogadoresElenco() {
		return jogadoresElenco;
	}

	public void setJogadoresElenco(Set<Integer> jogadoresElenco) {
		this.jogadoresElenco = jogadoresElenco;
	}
}
