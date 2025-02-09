package soccervs.persistence.core.dtos;

import soccervs.persistence.core.entities.enums.EAcaoOf;

public class AOfensivasDTO extends AOfensivasCreateDTO {
	private Long id;

	public AOfensivasDTO(EAcaoOf acao, Byte tentativasT, Byte tBemSucedidas, Float efetividade, Long jogadorId,
			Long partidaId, Long id) {
		super(acao, tentativasT, tBemSucedidas, efetividade, jogadorId, partidaId);
		this.id = id;
	}

	public AOfensivasDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AOfensivasDTO(EAcaoOf acao, Byte tentativasT, Byte tBemSucedidas, Float efetividade, Long jogadorId,
			Long partidaId) {
		super(acao, tentativasT, tBemSucedidas, efetividade, jogadorId, partidaId);
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
