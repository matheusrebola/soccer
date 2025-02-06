package soccervs.statics.core.dtos;

import soccervs.statics.core.entities.enums.ECompeticao;
import soccervs.statics.core.entities.enums.EDisputa;

public class CompeticaoDTO extends CompeticaoCreateDTO {
	private String id;
	
	public CompeticaoDTO(String nome, Short ano, ECompeticao tipoCompeticao, EDisputa tipoDisputa, String paisRegiao,
			String id) {
		super(nome, ano, tipoCompeticao, tipoDisputa, paisRegiao);
		this.id = id;
	}

	public CompeticaoDTO() {super();}

	public CompeticaoDTO(String nome, Short ano, ECompeticao tipoCompeticao, EDisputa tipoDisputa, String paisRegiao) {
		super(nome, ano, tipoCompeticao, tipoDisputa, paisRegiao);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}	
}
