package soccervs.persistence.core.dtos.order;

import java.time.LocalDateTime;

import soccervs.persistence.core.dtos.Order;

public class LDefensivaCreate extends Order {
	private Float alturaMedia;
	private Float tempo;
	private Long partidaId;
	private Long timeId;

	public LDefensivaCreate(String id, LocalDateTime createdAt, String transactionId, Float alturaMedia, Float tempo,
			Long partidaId, Long timeId) {
		super(id, createdAt, transactionId);
		this.alturaMedia = alturaMedia;
		this.tempo = tempo;
		this.partidaId = partidaId;
		this.timeId = timeId;
	}

	public LDefensivaCreate(Float alturaMedia, Float tempo, Long partidaId, Long timeId) {
		super();
		this.alturaMedia = alturaMedia;
		this.tempo = tempo;
		this.partidaId = partidaId;
		this.timeId = timeId;
	}

	public LDefensivaCreate() {
		super();
	}

	public LDefensivaCreate(String id, LocalDateTime createdAt, String transactionId) {
		super(id, createdAt, transactionId);
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
