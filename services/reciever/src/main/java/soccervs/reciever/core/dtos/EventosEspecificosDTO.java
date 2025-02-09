package soccervs.reciever.core.dtos;

import soccervs.reciever.core.documents.enums.EEventoEspecifico;

public class EventosEspecificosDTO extends EventosEspecificosCreateDTO {
	private Long id;

	public EventosEspecificosDTO(EEventoEspecifico evento, Byte minuto, Long partidaId, Long jogadorId, Long id) {
		super(evento, minuto, partidaId, jogadorId);
		this.id = id;
	}

	public EventosEspecificosDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EventosEspecificosDTO(EEventoEspecifico evento, Byte minuto, Long partidaId, Long jogadorId) {
		super(evento, minuto, partidaId, jogadorId);
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
