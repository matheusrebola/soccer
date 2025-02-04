package soccervs.statics.core.entities;

import java.time.Year;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import soccervs.statics.core.entities.enums.ECompeticao;
import soccervs.statics.core.entities.enums.EParticipante;

@Entity
@Table(name="tb_titulos")
public class Titulos {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "nome_titulo", length = 45)
	private String nome;
	
	@Column(name = "tipo_participante") @Enumerated(EnumType.STRING)
	private EParticipante tipoParticipante;
	
	@Column
	private String temporada;
	
	@Column
	private String posicaoFinal;
	
	@Column
	private Year conquista;
	
	@Column(name = "tipo_titulo") @Enumerated(EnumType.STRING)
	private ECompeticao tipoTitulo;
	
	@Column(name = "participante_id")
	private Long participante;
	
	@ManyToOne @JoinColumn(name = "clube_id", nullable = false)
	private Clubes clube;
	
	@ManyToOne @JoinColumn(name = "competicao_id", nullable = false)
	private Competicoes competicao;
}
