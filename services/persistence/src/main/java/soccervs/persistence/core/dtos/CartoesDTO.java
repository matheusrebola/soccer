package soccervs.persistence.core.dtos;

import soccervs.persistence.core.entities.enums.ECartao;

public class CartoesDTO extends CartoesCreateDTO {
	private Long id;

	public CartoesDTO(Byte minuto, ECartao cartao, String motivo, Long jogadorId, Long partidaId, Long id) {
		super(minuto, cartao, motivo, jogadorId, partidaId);
		this.id = id;
	}

	public CartoesDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartoesDTO(Byte minuto, ECartao cartao, String motivo, Long jogadorId, Long partidaId) {
		super(minuto, cartao, motivo, jogadorId, partidaId);
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
