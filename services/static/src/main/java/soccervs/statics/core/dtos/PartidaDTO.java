package soccervs.statics.core.dtos;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class PartidaDTO extends PartidaCreateDTO {
	private Long id;

	public PartidaDTO(LocalDateTime dataPartida, String localPartida, Short casa, Short fora, Byte placarCasa,
			Byte placarVisitante, Integer tecnico, Short temporada, Short competicao, Long id) {
		super(dataPartida, localPartida, casa, fora, placarCasa, placarVisitante, tecnico, temporada, competicao);
		this.id = id;
	}

	public PartidaDTO() {super();}

	public PartidaDTO(LocalDateTime dataPartida, String localPartida, Short casa, Short fora, Byte placarCasa,
			Byte placarVisitante, Integer tecnico, Short temporada, Short competicao) {
		super(dataPartida, localPartida, casa, fora, placarCasa, placarVisitante, tecnico, temporada, competicao);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
