package soccervs.reciever.core.dtos;

import soccervs.reciever.core.documents.enums.EEvento;
import soccervs.reciever.core.documents.enums.EResultado;

public class EventosDTO extends EventosCreateDTO {
	private Long id;

	public EventosDTO(Float tempo, EEvento evento, EResultado resultado, Short eixoX, Short eixoY, Long jogadorId,
			Long partidaId, Long id) {
		super(tempo, evento, resultado, eixoX, eixoY, jogadorId, partidaId);
		this.id = id;
	}

	public EventosDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EventosDTO(Float tempo, EEvento evento, EResultado resultado, Short eixoX, Short eixoY, Long jogadorId,
			Long partidaId) {
		super(tempo, evento, resultado, eixoX, eixoY, jogadorId, partidaId);
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
