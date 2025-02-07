package soccervs.statics.core.dtos;

public class TemporadaDTO extends TemporadaCreateDTO {
	private Long id;

	public TemporadaDTO(String temporada, Short dataInicio, Short dataFim, Long competicao, Long id) {
		super(temporada, dataInicio, dataFim, competicao);
		this.id = id;
	}

	public TemporadaDTO() {super();}

	public TemporadaDTO(String temporada, Short dataInicio, Short dataFim, Long competicao) {
		super(temporada, dataInicio, dataFim, competicao);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
