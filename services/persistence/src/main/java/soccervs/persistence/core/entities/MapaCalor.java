package soccervs.persistence.core.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import soccervs.persistence.core.entities.enums.EZona;

@Entity
@Table(name="tb_mapa_calor")
public class MapaCalor {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private EZona zona;
	private Float percentual;
	private Long jogadorId;
	private Long partidaId;

	public MapaCalor(Long id, EZona zona, Float percentual, Long jogadorId, Long partidaId) {
		super();
		this.id = id;
		this.zona = zona;
		this.percentual = percentual;
		this.jogadorId = jogadorId;
		this.partidaId = partidaId;
	}

	public MapaCalor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EZona getZona() {
		return zona;
	}

	public void setZona(EZona zona) {
		this.zona = zona;
	}

	public Float getPercentual() {
		return percentual;
	}

	public void setPercentual(Float percentual) {
		this.percentual = percentual;
	}

	public Long getJogadorId() {
		return jogadorId;
	}

	public void setJogadorId(Long jogadorId) {
		this.jogadorId = jogadorId;
	}

	public Long getPartidaId() {
		return partidaId;
	}

	public void setPartidaId(Long partidaId) {
		this.partidaId = partidaId;
	}

}
