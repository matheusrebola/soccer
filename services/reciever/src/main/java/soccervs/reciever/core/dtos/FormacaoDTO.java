package soccervs.reciever.core.dtos;

import soccervs.reciever.core.documents.enums.EFormacao;

public class FormacaoDTO extends FormacaoCreateDTO {
	private Long id;

	public FormacaoDTO(Float minuto, EFormacao formacao, Long jogadorId, Long partidaId, Long id) {
		super(minuto, formacao, jogadorId, partidaId);
		this.id = id;
	}

	public FormacaoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FormacaoDTO(Float minuto, EFormacao formacao, Long jogadorId, Long partidaId) {
		super(minuto, formacao, jogadorId, partidaId);
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
