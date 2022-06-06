package com.ifce.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifce.br.model.Saiyajin;
import com.ifce.br.repository.SaiyajinRepository;

@Service
public class SaiyajinService {
	
	@Autowired
	private SaiyajinRepository saiyajinRepo;
	
	public void cadastrarSaiyajin(Saiyajin saiyajin) {
		saiyajinRepo.save(saiyajin);
		
	}
	
public List<Saiyajin> listarSaiyajins(){
		
		return saiyajinRepo.findAll();
	}
    
    public void excluirSaiyajinPeloId(Long codigo) {
    	saiyajinRepo.deleteById(codigo);
    }

}
