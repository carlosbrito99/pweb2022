package com.ifce.br.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MapKeyTemporal;
import jakarta.persistence.TemporalType;


@Entity
public class Carro {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;
	private String nome;
	private String placa;
	private String modelo;
	private String marca;
	private String anoDeFab;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@MapKeyTemporal(TemporalType.DATE)
	private Date dataCadastro;

	public Date getDataCadastro() {
		return getDataCadastro();
	}


	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}


	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAnoDeFab() {
		return anoDeFab;
	}

	public void setAnoDeFab(String anoDeFab) {
		this.anoDeFab = anoDeFab;
	}

	@Override
	public String toString() {
		return "Carro [codigo=" + codigo + ", nome=" + nome + ", placa=" + placa + ", modelo=" + modelo + ", marca="
				+ marca + ", anoDeFab=" + anoDeFab + ", dataCadastro=" + dataCadastro + "]";
	}

}




