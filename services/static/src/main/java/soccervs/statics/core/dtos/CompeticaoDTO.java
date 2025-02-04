package soccervs.statics.core.dtos;

import lombok.Data;
import soccervs.statics.core.entities.enums.ECompeticao;
import soccervs.statics.core.entities.enums.EDisputa;

@Data
public class CompeticaoDTO {
	private Short id;
	private String nome;
	private Short ano;
	private ECompeticao tipoCompeticao;
	private EDisputa tipoDisputa;
	private String paisRegiao;
	private Integer titulo;
	private Short temporada;
	private Long resultado;
	private Long partida;
}
