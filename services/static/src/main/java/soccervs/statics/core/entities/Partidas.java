package soccervs.statics.core.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_partidas")
public class Partidas {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "data_partida")
	private LocalDateTime dataPartida;
	
	@Column(name = "local_partida", length = 45)
	private String localPartida;
	
	@Column(name = "id_casa")
	private Long casa;
	
	@Column(name = "id_visitante")
	private Long fora;
	
	@Column(name = "placar_casa")
	private Byte placarCasa;
	
	@Column(name = "placar_visitante")
	private Byte placarVisitante;
	
	@Column(name = "tecnico_id", nullable = false)
	private Long tecnico;
	
	@Column(name = "temporada_id", nullable = false)
	private Long temporada;
	
	@Column(name = "competicao_id", nullable = false)
	private Long competicao;

	public Partidas(Long id, LocalDateTime dataPartida, String localPartida, Long casa, Long fora, Byte placarCasa,
			Byte placarVisitante, Long tecnico, Long temporada, Long competicao) {
		super();
		this.id = id;
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

	public Partidas() {super();}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
