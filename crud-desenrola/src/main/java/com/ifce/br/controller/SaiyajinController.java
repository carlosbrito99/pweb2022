package com.ifce.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.ifce.br.model.Saiyajin;
import com.ifce.br.service.SaiyajinService;

@Controller
public class SaiyajinController {
	
	@Autowired
	private SaiyajinService saiyajinService;
	
	
	@GetMapping("/saiyajin/salvar")
	public String olaGuerreiro() {
		return"ola-guerreiro";
	}
	
	@GetMapping("/saiyajin/formulario")
	public String formulario() {
		return "formulario";
	}
	
	@GetMapping("/cadastroSaiyajin")  
	public String cadastroSaiyajin(Saiyajin saiyajin) { 
		saiyajinService.cadastrarSaiyajin(saiyajin);
	return	"redirect:/saiyajin/listar";
	}
	
	@GetMapping("/saiyajin/listar")
	public ModelAndView listarSaiyajins() {
		List<Saiyajin>saiyajins =saiyajinService.listarSaiyajins();
		ModelAndView mv = new ModelAndView("listagem-Saiyajin");
		
	
		
		mv.addObject("listarSaiyajins", saiyajins);
		
		return mv;
	

	}
	
	@GetMapping("/saiyajin/excluir/{codigo}")
	public ModelAndView excluirSaiyajinPeloId(@PathVariable Long codigo) {
		saiyajinService.excluirSaiyajinPeloId(codigo);
		
		ModelAndView mv = new ModelAndView("redirect:/saiyajin/listar");
		
		return mv;
	}
	
	
	
}
