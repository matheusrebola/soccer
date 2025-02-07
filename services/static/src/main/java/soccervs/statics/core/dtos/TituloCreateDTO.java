package soccervs.statics.core.dtos;

import java.time.Year;

import soccervs.statics.core.entities.enums.ECompeticao;
import soccervs.statics.core.entities.enums.EParticipante;

public class TituloCreateDTO {
	private String nome;
	private EParticipante tipoParticipante;
	private String temporada;
	private String posicaoFinal;
	private Year conquista;
	private ECompeticao tipoTitulo;
	private Long participante;
	private Long clube;
	private Long competicao;
	
	public TituloCreateDTO(String nome, EParticipante tipoParticipante, String temporada, String posicaoFinal,
			Year conquista, ECompeticao tipoTitulo, Long participante, Long clube, Long competicao) {
		super();
		this.nome = nome;
		this.tipoParticipante = tipoParticipante;
		this.temporada = temporada;
		this.posicaoFinal = posicaoFinal;
		this.conquista = conquista;
		this.tipoTitulo = tipoTitulo;
		this.participante = participante;
		this.clube = clube;
		this.competicao = competicao;
	}

	public TituloCreateDTO() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EParticipante getTipoParticipante() {
		return tipoParticipante;
	}

	public void setTipoParticipante(EParticipante tipoParticipante) {
		this.tipoParticipante = tipoParticipante;
	}

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public String getPosicaoFinal() {
		return posicaoFinal;
	}

	public void setPosicaoFinal(String posicaoFinal) {
		this.posicaoFinal = posicaoFinal;
	}

	public Year getConquista() {
		return conquista;
	}

	public void setConquista(Year conquista) {
		this.conquista = conquista;
	}

	public ECompeticao getTipoTitulo() {
		return tipoTitulo;
	}

	public void setTipoTitulo(ECompeticao tipoTitulo) {
		this.tipoTitulo = tipoTitulo;
	}

	public Long getParticipante() {
		return participante;
	}

	public void setParticipante(Long participante) {
		this.participante = participante;
	}

	public Long getClube() {
		return clube;
	}

	public void setClube(Long clube) {
		this.clube = clube;
	}

	public Long getCompeticao() {
		return competicao;
	}

	public void setCompeticao(Long competicao) {
		this.competicao = competicao;
	}
}
