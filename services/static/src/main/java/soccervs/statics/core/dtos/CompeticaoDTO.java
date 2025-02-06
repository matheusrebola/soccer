package soccervs.statics.core.dtos;

import soccervs.statics.core.entities.enums.ECompeticao;
import soccervs.statics.core.entities.enums.EDisputa;

public class CompeticaoDTO extends CompeticaoCreateDTO {
	private Short id;

	public CompeticaoDTO(String nome, Short ano, ECompeticao tipoCompeticao, EDisputa tipoDisputa, String paisRegiao,
			Integer titulo, Short temporada, Long resultado, Long partida, Short id) {
		super(nome, ano, tipoCompeticao, tipoDisputa, paisRegiao, titulo, temporada, resultado, partida);
		this.id = id;
	}

	public CompeticaoDTO() {super();}

	public CompeticaoDTO(String nome, Short ano, ECompeticao tipoCompeticao, EDisputa tipoDisputa, String paisRegiao,
			Integer titulo, Short temporada, Long resultado, Long partida) {
		super(nome, ano, tipoCompeticao, tipoDisputa, paisRegiao, titulo, temporada, resultado, partida);
	}

	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}	
}
