package soccervs.statics.core.dtos;

import java.time.LocalDate;
import java.util.Set;

import lombok.Data;
import soccervs.statics.core.entities.enums.EPePreferido;

@Data
public class JogadorDTO {
	private Long id;
	private String nome;
	private LocalDate dataNascimento;
	private String nacionalidade;
	private EPePreferido pePreferido;
	private Float altura;
	private Float peso;
	private Set<Byte> posicao;
	private Set<Integer> jogadoresElenco;
}
