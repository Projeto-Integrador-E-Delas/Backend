package com.generation.edelas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.edelas.model.Servico;



public interface ServicoRepository extends JpaRepository<Servico, Long>{
	public List<Servico> findAllByNomeContainingIgnoreCase(@Param("nome")String nome);

}
