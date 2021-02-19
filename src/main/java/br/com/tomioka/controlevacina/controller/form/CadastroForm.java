package br.com.tomioka.controlevacina.controller.form;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.tomioka.controlevacina.modelo.Cadastro;

public class CadastroForm {

	@NotNull(message = "Não pode ser nulo") @NotEmpty(message = "Preenchimento obrigatório")
	private String nome;
	
	@NotNull(message = "Não pode ser nulo") @NotEmpty(message = "Preenchimento obrigatório")
	@Email(message = "E-mail inválido")
	private String email;
	
	@NotNull(message = "Não pode ser nulo") @NotEmpty(message = "Preenchimento obrigatório")
	@CPF(message = "CPF inválido")
	private String cpf;
	
	@NotNull(message = "Não pode ser nulo") @Past(message = "Data de nascimento inválida")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataNascimento;
	
	@NotNull(message = "Não pode ser nulo") @NotEmpty(message = "Preenchimento obrigatório")
	private String senha;

	public Cadastro converte() {
		return new Cadastro(nome, email, cpf, dataNascimento, senha);
	}
	
	// setters

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
