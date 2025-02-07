package soccervs.statics.core.dtos;

public class TemporadaCreateDTO {
	private String temporada;
	private Short dataInicio;	
	private Short dataFim;
	private Long competicao;
	
	public TemporadaCreateDTO(String temporada, Short dataInicio, Short dataFim, Long competicao) {
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

	public Short getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Short dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Short getDataFim() {
		return dataFim;
	}

	public void setDataFim(Short dataFim) {
		this.dataFim = dataFim;
	}

	public Long getCompeticao() {
		return competicao;
	}

	public void setCompeticao(Long competicao) {
		this.competicao = competicao;
	}
}
