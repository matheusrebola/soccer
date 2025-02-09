package soccervs.reciever.core.dtos;

public class DriblesDTO extends DriblesCreateDTO {
	private Long id;

	public DriblesDTO(Byte tTotatis, Byte tBemSucedidas, Float efetividade, Long jogadorId, Long partidaId, Long id) {
		super(tTotatis, tBemSucedidas, efetividade, jogadorId, partidaId);
		this.id = id;
	}

	public DriblesDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DriblesDTO(Byte tTotatis, Byte tBemSucedidas, Float efetividade, Long jogadorId, Long partidaId) {
		super(tTotatis, tBemSucedidas, efetividade, jogadorId, partidaId);
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
