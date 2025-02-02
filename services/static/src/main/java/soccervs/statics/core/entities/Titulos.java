package soccervs.statics.core.entities;

import java.time.Year;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.RequiredArgsConstructor;
import soccervs.statics.core.entities.enums.ECompeticao;
import soccervs.statics.core.entities.enums.EParticipante;

@Entity(name="titulos")
@Table(name="tb_titulos")
@RequiredArgsConstructor
public class Titulos {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String nome;
	
	private EParticipante tipoParticipante;
	
	private String temporada;
	
	private String posicaoFinal;
	
	private Year conquista;
	
	private ECompeticao titulo;
	
	private Long participante;
	
	private Clubes clube;
	
	private Competicoes competicao;
}
