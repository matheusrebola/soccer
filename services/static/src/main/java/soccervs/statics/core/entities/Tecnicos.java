package soccervs.statics.core.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.RequiredArgsConstructor;

@Entity(name="tecnicos")
@Table(name="tb_tecnicos")
@RequiredArgsConstructor
public class Tecnicos{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String nome;
	
	private String nacionalidade;
	
	private LocalDate nascimento;
	
	private Byte experiencia;
	
	private String filosofia;
	
}
