package soccervs.statics.core.dtos;

import soccervs.statics.core.entities.enums.ECompeticao;
import soccervs.statics.core.entities.enums.EDisputa;

public class CompeticaoCreateDTO {
	private String nome;
	private Short ano;
	private ECompeticao tipoCompeticao;
	private EDisputa tipoDisputa;
	private String paisRegiao;
	private Integer titulo;
	private Short temporada;
	private Long resultado;
	private Long partida;
	
	public CompeticaoCreateDTO(String nome, Short ano, ECompeticao tipoCompeticao, EDisputa tipoDisputa,
			String paisRegiao, Integer titulo, Short temporada, Long resultado, Long partida) {
		this.nome = nome;
		this.ano = ano;
		this.tipoCompeticao = tipoCompeticao;
		this.tipoDisputa = tipoDisputa;
		this.paisRegiao = paisRegiao;
		this.titulo = titulo;
		this.temporada = temporada;
		this.resultado = resultado;
		this.partida = partida;
	}

	public CompeticaoCreateDTO() {super();}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Short getAno() {
		return ano;
	}

	public void setAno(Short ano) {
		this.ano = ano;
	}

	public ECompeticao getTipoCompeticao() {
		return tipoCompeticao;
	}

	public void setTipoCompeticao(ECompeticao tipoCompeticao) {
		this.tipoCompeticao = tipoCompeticao;
	}

	public EDisputa getTipoDisputa() {
		return tipoDisputa;
	}

	public void setTipoDisputa(EDisputa tipoDisputa) {
		this.tipoDisputa = tipoDisputa;
	}

	public String getPaisRegiao() {
		return paisRegiao;
	}

	public void setPaisRegiao(String paisRegiao) {
		this.paisRegiao = paisRegiao;
	}

	public Integer getTitulo() {
		return titulo;
	}

	public void setTitulo(Integer titulo) {
		this.titulo = titulo;
	}

	public Short getTemporada() {
		return temporada;
	}

	public void setTemporada(Short temporada) {
		this.temporada = temporada;
	}

	public Long getResultado() {
		return resultado;
	}

	public void setResultado(Long resultado) {
		this.resultado = resultado;
	}

	public Long getPartida() {
		return partida;
	}

	public void setPartida(Long partida) {
		this.partida = partida;
	}
	
}
