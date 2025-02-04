package soccervs.statics.core.dtos;

import java.util.Set;

import lombok.Data;

@Data
public class ElencoDTO {
	private Integer id;
	private String nome;
	private Short anoFormacao;
	private String tecnicoResponsavel;
	private Integer tecnico;
	private Short clube;
	private Short temporada;
	private Set<Integer> jogadoresElenco;
}
