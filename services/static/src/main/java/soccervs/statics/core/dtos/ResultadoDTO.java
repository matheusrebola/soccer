package soccervs.statics.core.dtos;

public class ResultadoDTO extends ResultadoCreateDTO {
	private Long id;

	public ResultadoDTO(Byte jogos, Byte vitorias, Byte empates, Byte derrotas, Byte aproveitamento, Byte marcados,
			Byte sofridos, Float desempenho, Short competicao, Short clube, Short temporada, Integer titulo, Long id) {
		super(jogos, vitorias, empates, derrotas, aproveitamento, marcados, sofridos, desempenho, competicao, clube,
				temporada, titulo);
		this.id = id;
	}

	public ResultadoDTO() {super();}

	public ResultadoDTO(Byte jogos, Byte vitorias, Byte empates, Byte derrotas, Byte aproveitamento, Byte marcados,
			Byte sofridos, Float desempenho, Short competicao, Short clube, Short temporada, Integer titulo) {
		super(jogos, vitorias, empates, derrotas, aproveitamento, marcados, sofridos, desempenho, competicao, clube, temporada,
				titulo);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
