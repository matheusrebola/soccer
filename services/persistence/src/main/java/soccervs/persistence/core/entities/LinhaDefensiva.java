package soccervs.persistence.core.entities;

public class LinhaDefensiva {
	private Long id;
	private Float alturaMedia;
	private Float tempo;
	private Long partidaId;
	private Long timeId;

	public LinhaDefensiva(Long id, Float alturaMedia, Float tempo, Long partidaId, Long timeId) {
		super();
		this.id = id;
		this.alturaMedia = alturaMedia;
		this.tempo = tempo;
		this.partidaId = partidaId;
		this.timeId = timeId;
	}

	public LinhaDefensiva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
