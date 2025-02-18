package soccervs.reciever.eventos.core.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import soccervs.reciever.eventos.core.documents.enums.EEvento;
import soccervs.reciever.eventos.core.documents.enums.EGravidade;
import soccervs.reciever.eventos.core.documents.enums.EMotivo;
import soccervs.reciever.eventos.core.documents.enums.EResultado;

@Document(collection = "eventos")
public class Eventos extends EventosCreate {
	@Id
	private String id;

	public Eventos(EEvento evento, Float distancia, Long jogadorOrigemId, Long jogadordestinoId, EResultado resultado,
			EGravidade gravidade, EMotivo motivo, Float tempo, Float posX, Float posY, Long partidaId, String id) {
		super(evento, distancia, jogadorOrigemId, jogadordestinoId, resultado, gravidade, motivo, tempo, posX, posY,
				partidaId);
		this.id = id;
	}

	public Eventos() {
		super();
	}

	public Eventos(EEvento evento, Float distancia, Long jogadorOrigemId, Long jogadordestinoId, EResultado resultado,
			EGravidade gravidade, EMotivo motivo, Float tempo, Float posX, Float posY, Long partidaId) {
		super(evento, distancia, jogadorOrigemId, jogadordestinoId, resultado, gravidade, motivo, tempo, posX, posY,
				partidaId);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
