package soccervs.statics.core.dtos;

public class ClubeByCityDTO {
	private String nome;
	private String cidade;
	private String pais;
	
	public ClubeByCityDTO(String nome, String cidade, String pais) {
		super();
		this.nome = nome;
		this.cidade = cidade;
		this.pais = pais;
	}

	public ClubeByCityDTO() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
}
