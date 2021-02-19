package br.com.tomioka.controlevacina.config.validacao;

public class ErroPadrao {

	private Integer status;
	private String mensagem;

	public ErroPadrao(Integer status, String mensagem) {
		super();
		this.status = status;
		this.mensagem = mensagem;
	}

	public Integer getStatus() {
		return status;
	}

	public String getMensagem() {
		return mensagem;
	}

}
