package soccervs.statics.core.dtos;

public class ResultadoCreateDTO {
	private Byte jogos;
	private Byte vitorias;
	private Byte empates;
	private Byte derrotas;
	private Byte aproveitamento;
	private Byte marcados;
	private Byte sofridos;
	private Float desempenho;
	private Short competicao;
	private Short clube;
	private Short temporada;
	private Integer titulo;
	
	public ResultadoCreateDTO(Byte jogos, Byte vitorias, Byte empates, Byte derrotas, Byte aproveitamento,
			Byte marcados, Byte sofridos, Float desempenho, Short competicao, Short clube, Short temporada,
			Integer titulo) {
		super();
		this.jogos = jogos;
		this.vitorias = vitorias;
		this.empates = empates;
		this.derrotas = derrotas;
		this.aproveitamento = aproveitamento;
		this.marcados = marcados;
		this.sofridos = sofridos;
		this.desempenho = desempenho;
		this.competicao = competicao;
		this.clube = clube;
		this.temporada = temporada;
		this.titulo = titulo;
	}

	public ResultadoCreateDTO() {super();}

	public Byte getJogos() {
		return jogos;
	}

	public void setJogos(Byte jogos) {
		this.jogos = jogos;
	}

	public Byte getVitorias() {
		return vitorias;
	}

	public void setVitorias(Byte vitorias) {
		this.vitorias = vitorias;
	}

	public Byte getEmpates() {
		return empates;
	}

	public void setEmpates(Byte empates) {
		this.empates = empates;
	}

	public Byte getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(Byte derrotas) {
		this.derrotas = derrotas;
	}

	public Byte getAproveitamento() {
		return aproveitamento;
	}

	public void setAproveitamento(Byte aproveitamento) {
		this.aproveitamento = aproveitamento;
	}

	public Byte getMarcados() {
		return marcados;
	}

	public void setMarcados(Byte marcados) {
		this.marcados = marcados;
	}

	public Byte getSofridos() {
		return sofridos;
	}

	public void setSofridos(Byte sofridos) {
		this.sofridos = sofridos;
	}

	public Float getDesempenho() {
		return desempenho;
	}

	public void setDesempenho(Float desempenho) {
		this.desempenho = desempenho;
	}

	public Short getCompeticao() {
		return competicao;
	}

	public void setCompeticao(Short competicao) {
		this.competicao = competicao;
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

	public Integer getTitulo() {
		return titulo;
	}

	public void setTitulo(Integer titulo) {
		this.titulo = titulo;
	}
}
