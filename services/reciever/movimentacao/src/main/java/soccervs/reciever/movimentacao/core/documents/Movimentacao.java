package soccervs.reciever.movimentacao.core.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movimentacao")
public class Movimentacao extends MovimentacaoCreate {
	@Id
	private String id;

	public Movimentacao(Short posX, Short posY, Float velocidade, Float aceleracao, Float tempo, Boolean pressao,
			Long jogadorId, Long partidaId, String id) {
		super(posX, posY, velocidade, aceleracao, tempo, pressao, jogadorId, partidaId);
		this.id = id;
	}

	public Movimentacao() {
		super();
	}

	public Movimentacao(Short posX, Short posY, Float velocidade, Float aceleracao, Float tempo, Boolean pressao,
			Long jogadorId, Long partidaId) {
		super(posX, posY, velocidade, aceleracao, tempo, pressao, jogadorId, partidaId);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
