package soccervs.statics.core.dtos;

import soccervs.statics.core.entities.enums.ECompeticao;
import soccervs.statics.core.entities.enums.EParticipante;

public class TituloDTO extends TituloCreateDTO {
	private Long id;

	public TituloDTO(String nome, EParticipante tipoParticipante, String temporada, String posicaoFinal, Short conquista,
			ECompeticao tipoTitulo, Long participante, Long clube, Long competicao, Long id) {
		super(nome, tipoParticipante, temporada, posicaoFinal, conquista, tipoTitulo, participante, clube, competicao);
		this.id = id;
	}

	public TituloDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TituloDTO(String nome, EParticipante tipoParticipante, String temporada, String posicaoFinal, Short conquista,
			ECompeticao tipoTitulo, Long participante, Long clube, Long competicao) {
		super(nome, tipoParticipante, temporada, posicaoFinal, conquista, tipoTitulo, participante, clube, competicao);
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
