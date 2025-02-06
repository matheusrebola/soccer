package soccervs.statics.core.dtos;

import java.time.LocalDate;
import java.util.Set;

import soccervs.statics.core.entities.enums.EPePreferido;

public class JogadorDTO extends JogadorCreateDTO {
	private Long id;

	public JogadorDTO(String nome, LocalDate dataNascimento, String nacionalidade, EPePreferido pePreferido,
			Float altura, Float peso, Set<Byte> posicao, Set<Integer> jogadoresElenco, Long id) {
		super(nome, dataNascimento, nacionalidade, pePreferido, altura, peso, posicao, jogadoresElenco);
		this.id = id;
	}

	public JogadorDTO() {super();}

	public JogadorDTO(String nome, LocalDate dataNascimento, String nacionalidade, EPePreferido pePreferido,
			Float altura, Float peso, Set<Byte> posicao, Set<Integer> jogadoresElenco) {
		super(nome, dataNascimento, nacionalidade, pePreferido, altura, peso, posicao, jogadoresElenco);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
