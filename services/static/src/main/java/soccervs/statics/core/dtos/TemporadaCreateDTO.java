package soccervs.statics.core.dtos;

import java.time.LocalDate;

public class TemporadaCreateDTO {
	private String temporada;
	private LocalDate dataInicio;	
	private LocalDate dataFim;
	private Long competicao;
	
	public TemporadaCreateDTO(String temporada, LocalDate dataInicio, LocalDate dataFim, Long competicao) {
		super();
		this.temporada = temporada;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.competicao = competicao;
	}

	public TemporadaCreateDTO() {
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
