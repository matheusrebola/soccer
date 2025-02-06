package soccervs.statics.core.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import soccervs.statics.core.entities.enums.ECompeticao;
import soccervs.statics.core.entities.enums.EDisputa;

@Entity
@Table(name="tb_competicoes")
public class Competicoes {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length = 50)
	private String nome;
	
	@Column
	private Short ano;
	
	@Column(name = "tipo_competicao") @Enumerated(EnumType.STRING)
	private ECompeticao tipoCompeticao;
	
	@Column(name = "tipo_disputa") @Enumerated(EnumType.STRING)
	private EDisputa tipoDisputa;
	
	@Column(name = "pais_ou_regiao", length = 50)
	private String paisRegiao;

	public Competicoes(Long id, String nome, Short ano, ECompeticao tipoCompeticao, EDisputa tipoDisputa,
			String paisRegiao) {
		super();
		this.id = id;
		this.nome = nome;
		this.ano = ano;
		this.tipoCompeticao = tipoCompeticao;
		this.tipoDisputa = tipoDisputa;
		this.paisRegiao = paisRegiao;
	}

	public Competicoes() {}

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

	public Short getAno() {
		return ano;
	}

	public void setAno(Short ano) {
		this.ano = ano;
	}

	public ECompeticao getTipoCompeticao() {
		return tipoCompeticao;
	}

	public void setTipoCompeticao(ECompeticao tipoCompeticao) {
		this.tipoCompeticao = tipoCompeticao;
	}

	public EDisputa getTipoDisputa() {
		return tipoDisputa;
	}

	public void setTipoDisputa(EDisputa tipoDisputa) {
		this.tipoDisputa = tipoDisputa;
	}

	public String getPaisRegiao() {
		return paisRegiao;
	}

	public void setPaisRegiao(String paisRegiao) {
		this.paisRegiao = paisRegiao;
	}
}
