package soccervs.reciever.core.dtos;

public class CoberturasDTO extends CoberturasCreateDTO {
	private Long id;

	public CoberturasDTO(Byte tentativasT, Byte tBemSucedidas, Float efetividade, Long jogadorId, Long partidaId,
			Long id) {
		super(tentativasT, tBemSucedidas, efetividade, jogadorId, partidaId);
		this.id = id;
	}

	public CoberturasDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CoberturasDTO(Byte tentativasT, Byte tBemSucedidas, Float efetividade, Long jogadorId, Long partidaId) {
		super(tentativasT, tBemSucedidas, efetividade, jogadorId, partidaId);
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
