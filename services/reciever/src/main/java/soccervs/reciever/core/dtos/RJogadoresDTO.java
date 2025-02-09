package soccervs.reciever.core.dtos;

import soccervs.reciever.core.documents.enums.EInteracao;

public class RJogadoresDTO extends RJogadoresCreateDTO {
	private Long id;

	public RJogadoresDTO(Long id, Long j1Id, Long j2Id, EInteracao interacao, Long partidaId, Long id2) {
		super(id, j1Id, j2Id, interacao, partidaId);
		id = id2;
	}

	public RJogadoresDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RJogadoresDTO(Long id, Long j1Id, Long j2Id, EInteracao interacao, Long partidaId) {
		super(id, j1Id, j2Id, interacao, partidaId);
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
