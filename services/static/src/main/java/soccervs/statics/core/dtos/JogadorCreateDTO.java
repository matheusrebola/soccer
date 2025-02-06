package soccervs.statics.core.dtos;

import java.time.LocalDate;
import java.util.Set;

import soccervs.statics.core.entities.enums.EPePreferido;

public class JogadorCreateDTO {
	private String nome;
	private LocalDate dataNascimento;
	private String nacionalidade;
	private EPePreferido pePreferido;
	private Float altura;
	private Float peso;
	private Set<Byte> posicao;
	private Set<Integer> jogadoresElenco;
	
	public JogadorCreateDTO(String nome, LocalDate dataNascimento, String nacionalidade, EPePreferido pePreferido,
			Float altura, Float peso, Set<Byte> posicao, Set<Integer> jogadoresElenco) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.nacionalidade = nacionalidade;
		this.pePreferido = pePreferido;
		this.altura = altura;
		this.peso = peso;
		this.posicao = posicao;
		this.jogadoresElenco = jogadoresElenco;
	}
	public JogadorCreateDTO() {super();}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public EPePreferido getPePreferido() {
		return pePreferido;
	}
	public void setPePreferido(EPePreferido pePreferido) {
		this.pePreferido = pePreferido;
	}
	public Float getAltura() {
		return altura;
	}
	public void setAltura(Float altura) {
		this.altura = altura;
	}
	public Float getPeso() {
		return peso;
	}
	public void setPeso(Float peso) {
		this.peso = peso;
	}
	public Set<Byte> getPosicao() {
		return posicao;
	}
	public void setPosicao(Set<Byte> posicao) {
		this.posicao = posicao;
	}
	public Set<Integer> getJogadoresElenco() {
		return jogadoresElenco;
	}
	public void setJogadoresElenco(Set<Integer> jogadoresElenco) {
		this.jogadoresElenco = jogadoresElenco;
	}
}
