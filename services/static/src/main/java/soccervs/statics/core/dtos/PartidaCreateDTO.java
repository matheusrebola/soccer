package soccervs.statics.core.dtos;

import java.time.LocalDateTime;

public class PartidaCreateDTO {
	private LocalDateTime dataPartida;
	private String localPartida;
	private Short casa;
	private Short fora;
	private Byte placarCasa;
	private Byte placarVisitante;
	private Integer tecnico;
	private Short temporada;
	private Short competicao;
	
	public PartidaCreateDTO(LocalDateTime dataPartida, String localPartida, Short casa, Short fora, Byte placarCasa,
			Byte placarVisitante, Integer tecnico, Short temporada, Short competicao) {
		super();
		this.dataPartida = dataPartida;
		this.localPartida = localPartida;
		this.casa = casa;
		this.fora = fora;
		this.placarCasa = placarCasa;
		this.placarVisitante = placarVisitante;
		this.tecnico = tecnico;
		this.temporada = temporada;
		this.competicao = competicao;
	}
	
	public PartidaCreateDTO() {super();}
	
	public LocalDateTime getDataPartida() {
		return dataPartida;
	}
	public void setDataPartida(LocalDateTime dataPartida) {
		this.dataPartida = dataPartida;
	}
	public String getLocalPartida() {
		return localPartida;
	}
	public void setLocalPartida(String localPartida) {
		this.localPartida = localPartida;
	}
	public Short getCasa() {
		return casa;
	}
	public void setCasa(Short casa) {
		this.casa = casa;
	}
	public Short getFora() {
		return fora;
	}
	public void setFora(Short fora) {
		this.fora = fora;
	}
	public Byte getPlacarCasa() {
		return placarCasa;
	}
	public void setPlacarCasa(Byte placarCasa) {
		this.placarCasa = placarCasa;
	}
	public Byte getPlacarVisitante() {
		return placarVisitante;
	}
	public void setPlacarVisitante(Byte placarVisitante) {
		this.placarVisitante = placarVisitante;
	}
	public Integer getTecnico() {
		return tecnico;
	}
	public void setTecnico(Integer tecnico) {
		this.tecnico = tecnico;
	}
	public Short getTemporada() {
		return temporada;
	}
	public void setTemporada(Short temporada) {
		this.temporada = temporada;
	}
	public Short getCompeticao() {
		return competicao;
	}
	public void setCompeticao(Short competicao) {
		this.competicao = competicao;
	}
}
