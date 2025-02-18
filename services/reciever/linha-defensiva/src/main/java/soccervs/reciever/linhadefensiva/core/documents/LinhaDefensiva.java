package soccervs.reciever.linhadefensiva.core.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ldefensiva")
public class LinhaDefensiva extends LinhaDefensivaCreate {
	@Id
	private String id;

	public LinhaDefensiva(Float altura, Float largura, Float tempo, Long partidaId, Long timeId, String id) {
		super(altura, largura, tempo, partidaId, timeId);
		this.id = id;
	}

	public LinhaDefensiva() {
		super();
	}

	public LinhaDefensiva(Float altura, Float largura, Float tempo, Long partidaId, Long timeId) {
		super(altura, largura, tempo, partidaId, timeId);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
