package com.algaworks.brewer.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Cliente {

	@NotBlank(message = "O nome é obrigatório")
	private String nome;
	@NotBlank(message = "Selecione se você é pessoa física ou jurídica")
	private String tipoPessoa;

	@Size(max= 11)
	private String cpf;
	@Size(max = 20)
	private String cnpj;
	
	private String[] telefones;
	@NotBlank(message = "O email é obrigatório")
	private String email;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipoPessoa() {
		return tipoPessoa;
	}
	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String[] getTelefones() {
		return telefones;
	}
	public void setTelefones(String[] telefones) {
		this.telefones = telefones;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	  
	
}
