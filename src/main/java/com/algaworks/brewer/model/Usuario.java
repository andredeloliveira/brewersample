package com.algaworks.brewer.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class Usuario {
	
	@NotBlank(message = "O nome é obrigatório")
	private String nome;
	@NotBlank(message = "O e-mail é obrigatório")
	private String email;
	@NotBlank(message = "A data de nascimento é obrigatória")
	private Date dataNascimento;
	//validação de match no front-end
	@NotBlank(message = "A senha é obrigatoria")
	private String senha;
	@NotNull(message = "Escolha um status")
	private boolean status;
	
	@NotNull(message = "Escolha um grupo de acesso")
	private String grupo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	

}
