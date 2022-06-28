package com.ifce.br.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifce.br.model.Carro;
import com.ifce.br.repository.CarroRepository;

@Service
public class CarroService {

	@Autowired
	private CarroRepository carroRepository;

	// SALVAR
	public void cadastrarCarro(Carro carro) {

		carroRepository.save(carro);

	}
	// LISTAR OS CARROS

	public List<Carro> listarCarros() {

		return carroRepository.findAll();
	}
	// EXCLUIR OS CARROS

	public void excluirCarroPeloId(Long codigo) {
		carroRepository.deleteById(codigo);
	}
	// ATUALIZAR OS CARROS

	public Optional<Carro> buscarPeloId(Long codigo) {

		return carroRepository.findById(codigo);
	}
}
