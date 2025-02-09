package soccervs.persistence.core.dtos;

public class LDefensivaDTO extends LDefensivaCreateDTO {
	private Long id;

	public LDefensivaDTO(Long id, Float alturaMedia, Float tempo, Long partidaId, Long timeId, Long id2) {
		super(id, alturaMedia, tempo, partidaId, timeId);
		id = id2;
	}

	public LDefensivaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LDefensivaDTO(Long id, Float alturaMedia, Float tempo, Long partidaId, Long timeId) {
		super(id, alturaMedia, tempo, partidaId, timeId);
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
