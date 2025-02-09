package soccervs.reciever.core.dtos;

public class EstPartidaDTO extends EstPartidaCreateDTO {
	private Long id;

	public EstPartidaDTO(Byte minJogados, Byte gols, Byte assist, Float veloMed, Float disPercorrida, Float pontuacao,
			Long jogadorId, Long partidaId, Long id) {
		super(minJogados, gols, assist, veloMed, disPercorrida, pontuacao, jogadorId, partidaId);
		this.id = id;
	}

	public EstPartidaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EstPartidaDTO(Byte minJogados, Byte gols, Byte assist, Float veloMed, Float disPercorrida, Float pontuacao,
			Long jogadorId, Long partidaId) {
		super(minJogados, gols, assist, veloMed, disPercorrida, pontuacao, jogadorId, partidaId);
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
