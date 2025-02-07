package soccervs.statics.core.dtos;

public class ElencoCreateDTO {
	private String nome;
	private Short anoFormacao;
	private String tecnicoResponsavel;
	private Integer tecnico;
	private Long clube;
	private Long temporada;
	
	public ElencoCreateDTO(String nome, Short anoFormacao, String tecnicoResponsavel, Integer tecnico, Long clube,
			Long temporada) {
		super();
		this.nome = nome;
		this.anoFormacao = anoFormacao;
		this.tecnicoResponsavel = tecnicoResponsavel;
		this.tecnico = tecnico;
		this.clube = clube;
		this.temporada = temporada;
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
