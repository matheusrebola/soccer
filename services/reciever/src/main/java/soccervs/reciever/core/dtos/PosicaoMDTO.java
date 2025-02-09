package soccervs.reciever.core.dtos;

public class PosicaoMDTO extends PosicaoMCreateDTO {
	private Long id;

	public PosicaoMDTO(Short eixoX, Short eixoY, Long partidaId, Long jogadorId, Long id) {
		super(eixoX, eixoY, partidaId, jogadorId);
		this.id = id;
	}

	public PosicaoMDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PosicaoMDTO(Short eixoX, Short eixoY, Long partidaId, Long jogadorId) {
		super(eixoX, eixoY, partidaId, jogadorId);
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
