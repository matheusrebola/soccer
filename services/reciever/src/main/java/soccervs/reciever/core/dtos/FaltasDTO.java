package soccervs.reciever.core.dtos;

import soccervs.reciever.core.documents.enums.EFalta;
import soccervs.reciever.core.documents.enums.EGravidade;
import soccervs.reciever.core.documents.enums.EResultadoF;

public class FaltasDTO extends FaltasCreateDTO {
	private Long id;

	public FaltasDTO(Byte min, Short eixoX, Short eixoY, EFalta falta, EResultadoF resultado, EGravidade gravidade,
			Long jogadorId, Long partidaId, Long id) {
		super(min, eixoX, eixoY, falta, resultado, gravidade, jogadorId, partidaId);
		this.id = id;
	}

	public FaltasDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FaltasDTO(Byte min, Short eixoX, Short eixoY, EFalta falta, EResultadoF resultado, EGravidade gravidade,
			Long jogadorId, Long partidaId) {
		super(min, eixoX, eixoY, falta, resultado, gravidade, jogadorId, partidaId);
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
