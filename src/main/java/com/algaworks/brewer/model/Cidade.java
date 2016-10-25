package com.algaworks.brewer.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class Cidade {
	
	@NotNull(message = "O estado deve ser selecionado")
	private String estado;
	
	@NotBlank(message = "O nome da cidade é obrigatório")
	private String nome;
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
