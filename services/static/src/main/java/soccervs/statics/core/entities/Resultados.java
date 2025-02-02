package soccervs.statics.core.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.RequiredArgsConstructor;

@Entity(name="resultados")
@Table(name="tb_resultados")
@RequiredArgsConstructor
public class Resultados {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Byte jogos;
	
	private Byte vitorias;
	
	private Byte empates;
	
	private Byte derrotas;
	
	private Byte aproveitamento;
	
	private Byte marcados;
	
	private Byte sofridos;
	
	private Byte desempenho;
	
	private Competicoes competicao;
	
	private Clubes clube;
	
	private Temporadas temporada;
	
	private Titulos titulo;
}
