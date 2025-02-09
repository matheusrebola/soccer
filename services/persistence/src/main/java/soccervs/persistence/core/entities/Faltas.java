package soccervs.persistence.core.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import soccervs.persistence.core.entities.enums.EFalta;
import soccervs.persistence.core.entities.enums.EGravidade;
import soccervs.persistence.core.entities.enums.EResultadoF;

@Entity
@Table(name="tb_faltas")
public class Faltas {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Byte min;
	private Short eixoX;
	private Short eixoY;
	private EFalta falta;
	private EResultadoF resultado;
	private EGravidade gravidade;
	private Long jogadorId;
	private Long partidaId;

	public Faltas(Long id, Byte min, Short eixoX, Short eixoY, EFalta falta, EResultadoF resultado,
			EGravidade gravidade, Long jogadorId, Long partidaId) {
		super();
		this.id = id;
		this.min = min;
		this.eixoX = eixoX;
		this.eixoY = eixoY;
		this.falta = falta;
		this.resultado = resultado;
		this.gravidade = gravidade;
		this.jogadorId = jogadorId;
		this.partidaId = partidaId;
	}

	public Faltas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Byte getMin() {
		return min;
	}

	public void setMin(Byte min) {
		this.min = min;
	}

	public Short getEixoX() {
		return eixoX;
	}

	public void setEixoX(Short eixoX) {
		this.eixoX = eixoX;
	}

	public Short getEixoY() {
		return eixoY;
	}

	public void setEixoY(Short eixoY) {
		this.eixoY = eixoY;
	}

	public EFalta getFalta() {
		return falta;
	}

	public void setFalta(EFalta falta) {
		this.falta = falta;
	}

	public EResultadoF getResultado() {
		return resultado;
	}

	public void setResultado(EResultadoF resultado) {
		this.resultado = resultado;
	}

	public EGravidade getGravidade() {
		return gravidade;
	}

	public void setGravidade(EGravidade gravidade) {
		this.gravidade = gravidade;
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
