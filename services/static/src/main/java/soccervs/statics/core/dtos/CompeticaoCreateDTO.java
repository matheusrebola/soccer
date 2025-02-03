package soccervs.statics.core.dtos;

import java.time.Year;

import lombok.Data;
import soccervs.statics.core.entities.enums.ECompeticao;
import soccervs.statics.core.entities.enums.EDisputa;

@Data
public class CompeticaoCreateDTO {
	private String nome;
	private Year ano;
	private ECompeticao tipoCompeticao;
	private EDisputa tipoDisputa;
	private String paisRegiao;
	private Integer titulo;
	private Short temporada;
	private Long resultado;
	private Long partida;
}
