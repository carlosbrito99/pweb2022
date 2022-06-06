package com.ifce.br.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifce.br.model.Saiyajin;

@Repository
public interface SaiyajinRepository extends JpaRepository<Saiyajin, Long>{
	

}
