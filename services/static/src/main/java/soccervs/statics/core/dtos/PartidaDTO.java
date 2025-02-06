package soccervs.statics.core.dtos;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class PartidaDTO extends PartidaCreateDTO {
	private Long id;
	
	public PartidaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PartidaDTO(LocalDateTime dataPartida, String localPartida, Short casa, Short fora, Byte placarCasa,
			Byte placarVisitante, Long tecnico, Long temporada, Long competicao) {
		super(dataPartida, localPartida, casa, fora, placarCasa, placarVisitante, tecnico, temporada, competicao);
		// TODO Auto-generated constructor stub
	}

	public PartidaDTO(LocalDateTime dataPartida, String localPartida, Short casa, Short fora, Byte placarCasa,
			Byte placarVisitante, Long tecnico, Long temporada, Long competicao, Long id) {
		super(dataPartida, localPartida, casa, fora, placarCasa, placarVisitante, tecnico, temporada, competicao);
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
