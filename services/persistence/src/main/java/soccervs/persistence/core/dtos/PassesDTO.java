package soccervs.persistence.core.dtos;

import soccervs.persistence.core.entities.enums.EPasse;

public class PassesDTO extends PassesCreateDTO {
	private Long id;

	public PassesDTO(EPasse passe, Byte tTotatis, Byte tBemSuce, Float efetividade, Long jogadorId, Long partidaId,
			Long id) {
		super(passe, tTotatis, tBemSuce, efetividade, jogadorId, partidaId);
		this.id = id;
	}

	public PassesDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PassesDTO(EPasse passe, Byte tTotatis, Byte tBemSuce, Float efetividade, Long jogadorId, Long partidaId) {
		super(passe, tTotatis, tBemSuce, efetividade, jogadorId, partidaId);
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
