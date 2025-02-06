package soccervs.statics.core.dtos;

import java.util.Set;

public class ElencoDTO extends ElencoCreateDTO {
	private Integer id;

	public ElencoDTO(String nome, Short anoFormacao, String tecnicoResponsavel, Integer tecnico, Short clube,
			Short temporada, Set<Integer> jogadoresElenco, Integer id) {
		super(nome, anoFormacao, tecnicoResponsavel, tecnico, clube, temporada, jogadoresElenco);
		this.id = id;
	}

	public ElencoDTO() {super();}

	public ElencoDTO(String nome, Short anoFormacao, String tecnicoResponsavel, Integer tecnico, Short clube,
			Short temporada, Set<Integer> jogadoresElenco) {
		super(nome, anoFormacao, tecnicoResponsavel, tecnico, clube, temporada, jogadoresElenco);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
