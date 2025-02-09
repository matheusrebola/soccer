package soccervs.persistence.core.dtos;

import soccervs.persistence.core.entities.enums.EFinalizacao;
import soccervs.persistence.core.entities.enums.EResultado;

public class FinalizacoesDTO extends FinalizacoesCreateDTO {
	private Long id;

	public FinalizacoesDTO(Float tempo, EFinalizacao finalizacao, EResultado resultado, Short eixoX, Short eixoY,
			Float expectativaGol, Long jogadorId, Long partidaId, Long id) {
		super(tempo, finalizacao, resultado, eixoX, eixoY, expectativaGol, jogadorId, partidaId);
		this.id = id;
	}

	public FinalizacoesDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FinalizacoesDTO(Float tempo, EFinalizacao finalizacao, EResultado resultado, Short eixoX, Short eixoY,
			Float expectativaGol, Long jogadorId, Long partidaId) {
		super(tempo, finalizacao, resultado, eixoX, eixoY, expectativaGol, jogadorId, partidaId);
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
