package soccervs.statics.core.entities;

import java.time.Year;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import soccervs.statics.core.entities.enums.ECompeticao;
import soccervs.statics.core.entities.enums.EParticipante;

@Entity
@Table(name="tb_titulos")
public class Titulos {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
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
	
	@Column(name = "clube_id", nullable = false)
	private Long clube;
	
	@Column(name = "competicao_id", nullable = false)
	private Long competicao;

	public Titulos(Long id, String nome, EParticipante tipoParticipante, String temporada, String posicaoFinal,
			Year conquista, ECompeticao tipoTitulo, Long participante, Long clube, Long competicao) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipoParticipante = tipoParticipante;
		this.temporada = temporada;
		this.posicaoFinal = posicaoFinal;
		this.conquista = conquista;
		this.tipoTitulo = tipoTitulo;
		this.participante = participante;
		this.clube = clube;
		this.competicao = competicao;
	}

	public Titulos() {super();}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EParticipante getTipoParticipante() {
		return tipoParticipante;
	}

	public void setTipoParticipante(EParticipante tipoParticipante) {
		this.tipoParticipante = tipoParticipante;
	}

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public String getPosicaoFinal() {
		return posicaoFinal;
	}

	public void setPosicaoFinal(String posicaoFinal) {
		this.posicaoFinal = posicaoFinal;
	}

	public Year getConquista() {
		return conquista;
	}

	public void setConquista(Year conquista) {
		this.conquista = conquista;
	}

	public ECompeticao getTipoTitulo() {
		return tipoTitulo;
	}

	public void setTipoTitulo(ECompeticao tipoTitulo) {
		this.tipoTitulo = tipoTitulo;
	}

	public Long getParticipante() {
		return participante;
	}

	public void setParticipante(Long participante) {
		this.participante = participante;
	}

	public Long getClube() {
		return clube;
	}

	public void setClube(Long clube) {
		this.clube = clube;
	}

	public Long getCompeticao() {
		return competicao;
	}

	public void setCompeticao(Long competicao) {
		this.competicao = competicao;
	}
}
