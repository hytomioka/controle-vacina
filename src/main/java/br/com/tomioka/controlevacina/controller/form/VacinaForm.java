package br.com.tomioka.controlevacina.controller.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.tomioka.controlevacina.modelo.Cadastro;
import br.com.tomioka.controlevacina.modelo.Vacina;
import br.com.tomioka.controlevacina.repository.CadastroRepository;

public class VacinaForm {

	@NotNull(message = "Não pode ser nulo") @NotEmpty(message = "Preenchimento obrigatório")
	private String nome;
	
	@NotNull(message = "Não pode ser nulo") @NotEmpty(message = "Preenchimento obrigatório")
	@Email(message = "E-mail inválido")
	private String emailCadastrado;
	
	@NotNull(message = "Não pode ser nulo") @NotEmpty(message = "Preenchimento obrigatório")
	private String localAplicacao;

	public Vacina converte(CadastroRepository cadastroRepository) {
		Cadastro cadastro = cadastroRepository.findByEmail(emailCadastrado);
		return new Vacina(nome, cadastro, localAplicacao);
	}
	
	// setters

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmailCadastrado() {
		return emailCadastrado;
	}

	public void setEmailCadastrado(String emailCadastrado) {
		this.emailCadastrado = emailCadastrado;
	}

	public void setLocalAplicacao(String localAplicacao) {
		this.localAplicacao = localAplicacao;
	}
}
