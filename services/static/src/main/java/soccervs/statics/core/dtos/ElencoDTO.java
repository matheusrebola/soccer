package soccervs.statics.core.dtos;

public class ElencoDTO extends ElencoCreateDTO {
	private String id;
	
	public ElencoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElencoDTO(String nome, Short anoFormacao, String tecnicoResponsavel, Integer tecnico, Long clube,
			Long temporada) {
		super(nome, anoFormacao, tecnicoResponsavel, tecnico, clube, temporada);
		// TODO Auto-generated constructor stub
	}

	public ElencoDTO(String nome, Short anoFormacao, String tecnicoResponsavel, Integer tecnico, Long clube,
			Long temporada, String id) {
		super(nome, anoFormacao, tecnicoResponsavel, tecnico, clube, temporada);
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
