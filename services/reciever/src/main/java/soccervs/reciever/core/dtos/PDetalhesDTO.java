package soccervs.reciever.core.dtos;

import soccervs.reciever.core.documents.enums.EPasse;
import soccervs.reciever.core.documents.enums.EResultado;

public class PDetalhesDTO extends PDetalhesCreateDTO {
	private Long id;

	public PDetalhesDTO(Float tempo, EPasse passe, EResultado resultado, Byte distancia, Long jOrigemId,
			Long jDestinoId, Long partidaId, Long id) {
		super(tempo, passe, resultado, distancia, jOrigemId, jDestinoId, partidaId);
		this.id = id;
	}

	public PDetalhesDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PDetalhesDTO(Float tempo, EPasse passe, EResultado resultado, Byte distancia, Long jOrigemId,
			Long jDestinoId, Long partidaId) {
		super(tempo, passe, resultado, distancia, jOrigemId, jDestinoId, partidaId);
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
