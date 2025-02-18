package soccervs.reciever.formacao.core.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import soccervs.reciever.formacao.core.documents.enums.EFormacao;
import soccervs.reciever.formacao.core.documents.enums.EModoJogo;

@Document(collection = "formacao")
public class Formacao extends FormacaoCreate {
	@Id
	private String id;

	public Formacao(Float tempoJogo, EFormacao formacao, EModoJogo modoJogo, Float compactacao, Long timeId,
			Long partidaId, String id) {
		super(tempoJogo, formacao, modoJogo, compactacao, timeId, partidaId);
		this.id = id;
	}

	public Formacao() {
		super();
	}

	public Formacao(Float tempoJogo, EFormacao formacao, EModoJogo modoJogo, Float compactacao, Long timeId,
			Long partidaId) {
		super(tempoJogo, formacao, modoJogo, compactacao, timeId, partidaId);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
