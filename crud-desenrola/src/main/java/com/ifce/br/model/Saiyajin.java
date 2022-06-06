package com.ifce.br.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Saiyajin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;
	
	private String raca;

	private String niveldepoder;

	private String transformacao;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getNiveldepoder() {
		return niveldepoder;
	}

	public void setNiveldepoder(String niveldepoder) {
		this.niveldepoder = niveldepoder;
	}

	public String getTransformacao() {
		return transformacao;
	}

	public void setTransformacao(String transformacao) {
		this.transformacao = transformacao;
	}
	
	

	
	
	
	

	

	
	
	
	


}
