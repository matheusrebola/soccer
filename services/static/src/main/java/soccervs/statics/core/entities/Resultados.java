package soccervs.statics.core.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_resultados")
public class Resultados {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "jogos_disputados")
	private Byte jogos;
	
	@Column
	private Byte vitorias;
	
	@Column
	private Byte empates;
	
	@Column
	private Byte derrotas;
	
	@Column(name = "aproveitamento_geral")
	private Byte aproveitamento;
	
	@Column(name = "gols_marcados")
	private Byte marcados;
	
	@Column(name = "gols_sofridos")
	private Byte sofridos;
	
	@Column
	private Float desempenho;
	
	@Column(name = "competicao_id", nullable = false)
	private Long competicao;
	
	@Column(name = "clube_id", nullable = false)
	private Long clube;
	
	@Column(name = "temporada_id", nullable = false)
	private Long temporada;
	
	@Column(name = "titulo_id", nullable = false)
	private Long titulo;

	public Resultados(Long id, Byte jogos, Byte vitorias, Byte empates, Byte derrotas, Byte aproveitamento,
			Byte marcados, Byte sofridos, Float desempenho, Long competicao, Long clube, Long temporada,
			Long titulo) {
		super();
		this.id = id;
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

	public Resultados() {super();}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Long getCompeticao() {
		return competicao;
	}

	public void setCompeticao(Long competicao) {
		this.competicao = competicao;
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

	public Long getTitulo() {
		return titulo;
	}

	public void setTitulo(Long titulo) {
		this.titulo = titulo;
	}
}
