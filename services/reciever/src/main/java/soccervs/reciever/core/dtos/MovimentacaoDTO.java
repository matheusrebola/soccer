package soccervs.reciever.core.dtos;

public class MovimentacaoDTO extends MovimentacaoCreateDTO {
	private Long id;

	public MovimentacaoDTO(Short eixoX, Short eixoY, Float aceleracao, Float desaceleracao, Byte pressao,
			Long jogadorId, Long partidaId, Long id) {
		super(eixoX, eixoY, aceleracao, desaceleracao, pressao, jogadorId, partidaId);
		this.id = id;
	}

	public MovimentacaoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MovimentacaoDTO(Short eixoX, Short eixoY, Float aceleracao, Float desaceleracao, Byte pressao,
			Long jogadorId, Long partidaId) {
		super(eixoX, eixoY, aceleracao, desaceleracao, pressao, jogadorId, partidaId);
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
