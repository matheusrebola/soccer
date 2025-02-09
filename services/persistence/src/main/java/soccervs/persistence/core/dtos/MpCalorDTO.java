package soccervs.persistence.core.dtos;

import soccervs.persistence.core.entities.enums.EZona;

public class MpCalorDTO extends MpCalorCreateDTO {
	private Long id;

	public MpCalorDTO(EZona zona, Float percentual, Long jogadorId, Long partidaId, Long id) {
		super(zona, percentual, jogadorId, partidaId);
		this.id = id;
	}

	public MpCalorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MpCalorDTO(EZona zona, Float percentual, Long jogadorId, Long partidaId) {
		super(zona, percentual, jogadorId, partidaId);
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
