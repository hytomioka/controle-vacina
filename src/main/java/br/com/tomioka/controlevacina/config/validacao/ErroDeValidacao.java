package br.com.tomioka.controlevacina.config.validacao;

public class ErroDeValidacao {

	private String campo;
	private String erro;

	public ErroDeValidacao(String campo, String erro) {
		super();
		this.campo = campo;
		this.erro = erro;
	}

	public String getCampo() {
		return campo;
	}

	public String getErro() {
		return erro;
	}

}
