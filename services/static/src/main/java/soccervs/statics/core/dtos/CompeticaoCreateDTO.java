package soccervs.statics.core.dtos;

import soccervs.statics.core.entities.enums.ECompeticao;
import soccervs.statics.core.entities.enums.EDisputa;

public class CompeticaoCreateDTO {
	private String nome;
	private Short ano;
	private ECompeticao tipoCompeticao;
	private EDisputa tipoDisputa;
	private String paisRegiao;
	
	public CompeticaoCreateDTO(String nome, Short ano, ECompeticao tipoCompeticao, EDisputa tipoDisputa,
			String paisRegiao) {
		super();
		this.nome = nome;
		this.ano = ano;
		this.tipoCompeticao = tipoCompeticao;
		this.tipoDisputa = tipoDisputa;
		this.paisRegiao = paisRegiao;
	}

	public CompeticaoCreateDTO() {}

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
