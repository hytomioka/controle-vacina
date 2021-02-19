package br.com.tomioka.controlevacina.config.validacao;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErroDeIntegridadeDeDadosHandler {

	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(DataIntegrityViolationException.class)
	public ErroPadrao handle() {
		
		ErroPadrao erro = new ErroPadrao(HttpStatus.BAD_REQUEST.value(), "Já possui um cadastro");
		return erro;
	}
}
