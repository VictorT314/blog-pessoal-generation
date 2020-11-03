package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity

public class PostagemModel {

	//ATRIBUTOS DA TABELA
	private Long id;
	
	private String titulo;

	private String texto;
	
	private Date date = new java.sql.Date(System.currentTimeMillis());

	//GETTERS AND SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
