package br.com.tomioka.controlevacina.controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.tomioka.controlevacina.controller.form.CadastroForm;
import br.com.tomioka.controlevacina.modelo.Cadastro;
import br.com.tomioka.controlevacina.repository.CadastroRepository;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {
	
	@Autowired
	CadastroRepository cadastroRepository;
	
	@PostMapping
	public ResponseEntity<Void> cadastra(@RequestBody @Valid CadastroForm form, UriComponentsBuilder uriBuilder) {
		Cadastro cadastro = form.converte();
		cadastroRepository.save(cadastro);
		
		URI uri = uriBuilder.path("/cadastro/{id}").buildAndExpand(cadastro.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
}



