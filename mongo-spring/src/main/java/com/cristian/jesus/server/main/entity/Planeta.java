package com.cristian.jesus.server.main.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Planeta {

	@Id
	private String id;
	private String nome;
	private String clima;
	private String terreno;
	private Integer qtdAparicoes;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}

	public String getTerreno() {
		return terreno;
	}

	public void setTerreno(String terreno) {
		this.terreno = terreno;
	}

	public Integer getQtdAparicoes() {
		return qtdAparicoes;
	}

	public void setQtdAparicoes(Integer qtdAparicoes) {
		this.qtdAparicoes = qtdAparicoes;
	}
}
