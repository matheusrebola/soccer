package soccervs.persistence.linhadefensiva.core.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_linha_defensiva")
public class LinhaDefensiva {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Float altura;
	private Float largura;
	private Float tempo;
	private Long partidaId;
	private Long timeId;

	public LinhaDefensiva(Long id, Float altura, Float largura, Float tempo, Long partidaId, Long timeId) {
		super();
		this.id = id;
		this.altura = altura;
		this.largura = largura;
		this.tempo = tempo;
		this.partidaId = partidaId;
		this.timeId = timeId;
	}

	public LinhaDefensiva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	public Float getLargura() {
		return largura;
	}

	public void setLargura(Float largura) {
		this.largura = largura;
	}

	public Float getTempo() {
		return tempo;
	}

	public void setTempo(Float tempo) {
		this.tempo = tempo;
	}

	public Long getPartidaId() {
		return partidaId;
	}

	public void setPartidaId(Long partidaId) {
		this.partidaId = partidaId;
	}

	public Long getTimeId() {
		return timeId;
	}

	public void setTimeId(Long timeId) {
		this.timeId = timeId;
	}

}
