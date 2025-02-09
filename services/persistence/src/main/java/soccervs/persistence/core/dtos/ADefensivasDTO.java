package soccervs.persistence.core.dtos;

import soccervs.persistence.core.entities.enums.EAcaoDef;

public class ADefensivasDTO extends ADefensivasCreateDTO {
	private Long id;

	public ADefensivasDTO(EAcaoDef acao, Byte tentativasT, Byte tBemSucedidas, Float efetividade, Long jogadorId,
			Long partidaId, Long id) {
		super(acao, tentativasT, tBemSucedidas, efetividade, jogadorId, partidaId);
		this.id = id;
	}

	public ADefensivasDTO() {
		super();
	}

	public ADefensivasDTO(EAcaoDef acao, Byte tentativasT, Byte tBemSucedidas, Float efetividade, Long jogadorId,
			Long partidaId) {
		super(acao, tentativasT, tBemSucedidas, efetividade, jogadorId, partidaId);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
