package br.com.ifce.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import br.com.ifce.config.HibernateConfig;
import br.com.ifce.model.Filme;

//CRIAR , ATUALIZAR, LISTAR, REMOVER E BUSCAR POR ID 
//ESSA CLASSE SERA CHAMADA PELO SERVICE PARA GERAR A INCRIVEL REGRA DE NEGOCIO
//AQUI ESTARÁ TODAS AS COISAS RELACIONADAS AO BANCO DE DADOS COM MYSQL E  O HIBERNATE

public class FilmeRepository {
     
	public void salvar(Filme filme) {
		Transaction transacao = null;
		Session session = (Session) HibernateConfig.getSessionFactory().openSession();
		
		transacao = session.beginTransaction();
		
		session.save(filme);
		
		transacao.commit();
		
		
	}
	
	public void removerRepository(Long id) {
		Transaction transacao = null;
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		transacao = session.beginTransaction();
		
		//MAGICA
		Filme filme = session.find(Filme.class, id);
		
		session.remove(filme);
		transacao.commit();
		
		
	}
	
	public void alterarRepository(Filme filme) {
		Transaction transacao = null;
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		transacao = session.beginTransaction();
		
		//MAGICA
		session.saveOrUpdate(filme);
		transacao.commit();
	}
	
	public List<Filme> listarRepository(){
		Transaction transacao = null;
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		transacao = session.beginTransaction();
		
		List<Filme> filme = session.createQuery("select f from Filme as f").getResultList();
			
		return filme;
	}
	
	public Filme buscarFilmePorIdRepository(Long id) {
		Transaction transacao = null;
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		transacao = session.beginTransaction();
		//MAGICA
		Filme filme = session.get(Filme.class, id);
		transacao.commit();
		return filme;
	}

	
	
	
	
	
}
