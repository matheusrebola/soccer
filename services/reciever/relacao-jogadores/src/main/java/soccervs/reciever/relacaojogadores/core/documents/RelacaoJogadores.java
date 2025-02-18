package soccervs.reciever.relacaojogadores.core.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import soccervs.reciever.relacaojogadores.core.documents.enums.EInteracao;

@Document(collection = "relacoes")
public class RelacaoJogadores extends RelacaoJogadoresCreate {
	@Id
	private String id;

	public RelacaoJogadores(Long j1Id, Long j2Id, EInteracao interacao, Long partidaId, String id) {
		super(j1Id, j2Id, interacao, partidaId);
		this.id = id;
	}

	public RelacaoJogadores() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RelacaoJogadores(Long j1Id, Long j2Id, EInteracao interacao, Long partidaId) {
		super(j1Id, j2Id, interacao, partidaId);
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
