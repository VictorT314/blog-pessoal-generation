package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PostagemModel;

@Repository
public interface PostagemRepository extends JpaRepository<PostagemModel, Long>{
	public List<PostagemModel> findAllByTituloContainingIgnoreCase(String titulo);
		
	@Query(value = "select * from postagem where ano > 2011", nativeQuery = true)
	List<PostagemModel> findAllMaior();
	
	@Query(value = "select * from postagem where ano > 2011 ORDER BY ano DESC", nativeQuery = true)
	List<PostagemModel> anosDesc();
	
	@Query(value = "select * from postagem where ano > 2011 ORDER BY ano ASC", nativeQuery = true)
	List<PostagemModel> anosAsc();
	
	@Query(value = "select * from postagem where ano >= 2011 and ano <= 2013", nativeQuery = true)
	List<PostagemModel> anosIntervalos();
}
