package soccervs.reciever.core.dtos;

public class LDefensivaCreateDTO {
	private Float alturaMedia;
	private Float tempo;
	private Long partidaId;
	private Long timeId;

	public LDefensivaCreateDTO(Long id, Float alturaMedia, Float tempo, Long partidaId, Long timeId) {
		super();
		this.alturaMedia = alturaMedia;
		this.tempo = tempo;
		this.partidaId = partidaId;
		this.timeId = timeId;
	}

	public LDefensivaCreateDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Float getAlturaMedia() {
		return alturaMedia;
	}

	public void setAlturaMedia(Float alturaMedia) {
		this.alturaMedia = alturaMedia;
	}

	public Float getTempo() {
		return tempo;
	}

	public void setTempo(Float tempo) {
		this.tempo = tempo;
	}

	public Long getPartidaId() {
		return partidaId;
	}

	public void setPartidaId(Long partidaId) {
		this.partidaId = partidaId;
	}

	public Long getTimeId() {
		return timeId;
	}

	public void setTimeId(Long timeId) {
		this.timeId = timeId;
	}

}
