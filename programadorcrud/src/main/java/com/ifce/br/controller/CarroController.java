package com.ifce.br.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ifce.br.model.Carro;
import com.ifce.br.service.CarroService;

@RequestMapping("/carro")
@Controller
public class CarroController {

	@Autowired
	private CarroService carroService;

	@RequestMapping("/carro/salvar")
	public ModelAndView cadastroCarro(Carro carro,@RequestParam(value="imagem")MultipartFile imagem) {
		carroService.cadastrarCarro(carro);
		ModelAndView mv = new ModelAndView("redirect:/carro/listar");

		return mv;
	}

	@GetMapping("/carro/formulario")
	public ModelAndView formulario() {
		ModelAndView mv = new ModelAndView("formulario");
		mv.addObject("carro", new Carro());
		return mv;
	}

	@GetMapping("/carro/listar")
	public ModelAndView listarCarros() {
		List<Carro> carros = carroService.listarCarros();
		ModelAndView mv = new ModelAndView("listagem-carro");
		mv.addObject("listarCarros", carros);

		return mv;

	}

	@RequestMapping("/carro/excluir/{codigo}")
	public ModelAndView excluirCarroPeloId(@PathVariable Long codigo) {
		carroService.excluirCarroPeloId(codigo);
		ModelAndView mv = new ModelAndView("redirect:/carro/listar");

		return mv;
	}

	@RequestMapping("/carro/atualizar/{codigo}")
	public ModelAndView atualizarCarrosPeloId(@PathVariable Long codigo) {
		Optional<Carro> carro = carroService.buscarPeloId(codigo);
		ModelAndView mv = new ModelAndView("formulario");
		mv.addObject("carro", carro);

		return mv;

	}

}
