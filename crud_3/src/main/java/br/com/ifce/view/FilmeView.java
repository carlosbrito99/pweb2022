package br.com.ifce.view;

import br.com.ifce.controller.FilmeController;
import br.com.ifce.model.Filme;

public class FilmeView {

	public static void main(String[] args) {
		FilmeController filmeController = new FilmeController();

		// BUSCAR POR ID
		Filme filme = filmeController.buscarFilmePorIdController((long) 1);

		Filme filme1 = new Filme();

		filme1.setTitulo("A Era do Gelo 3");
		filme1.setCategoria("Comedia");
		filme1.setPreco(80);
		filme1.setDuracaoMinutos(120);
		filme1.setDataLançamento("10/02/2014");
		filme1.setId(1);

		filmeController.adicionarController(filme1);
		filme1.setTitulo("A Era do Gelo 3");
		filme1.setCategoria("Comedia");
		filme1.setPreco(80);
		filme1.setDuracaoMinutos(120);
		filme1.setDataLançamento("10/02/2014");
		filme1.setId(1);
		
		
		

		Filme filme2 = new Filme();
		
		filme2.setTitulo("Afogados");
		filme2.setPreco(25);
		filme2.setCategoria("Terror");
		filme2.setDuracaoMinutos(120);
		filme2.setDataLançamento("13/02/2018");
		filme2.setId(2);

		filmeController.adicionarController(filme2);
		
Filme filme3 = new Filme();
		
		filme3.setTitulo("Os Mortos");
		filme3.setPreco(75);
		filme3.setCategoria("Terror");
		filme3.setDuracaoMinutos(120);
		filme3.setDataLançamento("03/09/2020");
		filme3.setId(3);

		filmeController.adicionarController(filme3);
		
		
		

		// Remover
		// filmeController.removerController((long) 1);

		// Adicionar
		// Filme filme1 = new Filme();

		// filme1.setTitulo("A Era do Gelo 3");
		// filme1.setCategoria("Comedia");
		// filme1.setPreco(80);
		// filme1.setDuracao(120);
		// filme1.setData("10/02/2014");

		// filmeController.adicionarController(filme1);

	}
	
	
	
}
