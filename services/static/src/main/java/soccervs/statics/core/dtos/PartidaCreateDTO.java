package soccervs.statics.core.dtos;

import java.time.LocalDateTime;

public class PartidaCreateDTO {
	private LocalDateTime dataPartida;
	private String localPartida;
	private Long casa;
	private Long fora;
	private Byte placarCasa;
	private Byte placarVisitante;
	private Long tecnico;
	private Long temporada;
	private Long competicao;
	
	public PartidaCreateDTO(LocalDateTime dataPartida, String localPartida, Long casa, Long fora, Byte placarCasa,
			Byte placarVisitante, Long tecnico, Long temporada, Long competicao) {
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
	public Long getCasa() {
		return casa;
	}
	public void setCasa(Long casa) {
		this.casa = casa;
	}
	public Long getFora() {
		return fora;
	}
	public void setFora(Long fora) {
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
	public Long getTecnico() {
		return tecnico;
	}
	public void setTecnico(Long tecnico) {
		this.tecnico = tecnico;
	}
	public Long getTemporada() {
		return temporada;
	}
	public void setTemporada(Long temporada) {
		this.temporada = temporada;
	}
	public Long getCompeticao() {
		return competicao;
	}
	public void setCompeticao(Long competicao) {
		this.competicao = competicao;
	}
}
