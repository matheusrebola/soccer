package soccervs.statics.core.entities;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_temporadas")
public class Temporadas {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length = 10)
	private String temporada;
	
	@Column(name = "data_inicio")
	private LocalDate dataInicio;
	
	@Column(name = "data_fim")
	private LocalDate dataFim;
	
	@Column(name = "competicao_id", nullable = false)
	private Long competicao;

	public Temporadas(Long id, String temporada, LocalDate dataInicio, LocalDate dataFim, Long competicao) {
		super();
		this.id = id;
		this.temporada = temporada;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.competicao = competicao;
	}

	public Temporadas() {super();}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}

	public Long getCompeticao() {
		return competicao;
	}

	public void setCompeticao(Long competicao) {
		this.competicao = competicao;
	}
}
