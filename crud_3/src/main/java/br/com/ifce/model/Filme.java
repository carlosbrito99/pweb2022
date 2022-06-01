package br.com.ifce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Filme {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String Titulo;
	private String Categoria;
	private double Preco;
	private int DuracaoMinutos;
	private String DataLan�amento;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return Titulo;
	}
	
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	
	public String getCategoria() {
		return Categoria;
	}
	
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	
	public double getPreco() {
		return Preco;
	}
	
	public void setPreco(double preco) {
		Preco = preco;
	}
	
	public int getDuracaoMinutos() {
		return DuracaoMinutos;
	}
	
	public void setDuracaoMinutos(int duracaoMinutos) {
		DuracaoMinutos = duracaoMinutos;
	}
	
	public String getDataLan�amento() {
		return DataLan�amento;
	}
	
	public void setDataLan�amento(String dataLan�amento) {
		DataLan�amento = dataLan�amento;
	}

	
	public void status(){
		System.out.println("Nome: " + this.getTitulo());
		System.out.println("Categoria: " + this.getCategoria());
		System.out.println("Preco: " + this.getPreco());
		System.out.println("Dura��o: " + this.getDuracaoMinutos());

	}
	
	@Override
	public String toString() {
		return "Filme [id=" + id + ", Titulo=" + Titulo + ", Categoria=" + Categoria + ", Preco=" + Preco
				+ ", DuracaoMinutos=" + DuracaoMinutos + ", DataLan�amento=" + DataLan�amento + "]";
	}
	public void setData(String string) {
		
		
	}
	public void setId(int i) {
		
		
	}
	
	
	



	



	
	}

	
	
	


