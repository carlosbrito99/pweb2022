package com.ifce.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ifce.br.model.Pessoa;
import com.ifce.br.service.PessoaService;

@Controller
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	
	@GetMapping("/pessoa/salvar")
	public String olaMundo() {
		return"ola-mundo";
	}
	
	@GetMapping("/pessoa/formulario")
	public String formulario() {
		return "formulario";
	}
	
	@GetMapping("/cadastroPessoa")  
	public String cadastroPessoa(Pessoa pessoa) {
		pessoaService.cadastrarPessoa(pessoa);
	return	"redirect:/pessoa/listar";
	}
	
	@GetMapping("/pessoa/listar")
	public ModelAndView listarPessoas() {
		List<Pessoa> pessoas =pessoaService.listarPessoas();
		ModelAndView mv = new ModelAndView("listagem-pessoa");
		
		mv.addObject("listarPessoas", pessoas);
		
		return mv;
		
		
		
		
	}

	


}


 

