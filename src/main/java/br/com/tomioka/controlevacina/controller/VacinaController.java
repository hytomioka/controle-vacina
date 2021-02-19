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

import br.com.tomioka.controlevacina.controller.form.VacinaForm;
import br.com.tomioka.controlevacina.modelo.Vacina;
import br.com.tomioka.controlevacina.repository.CadastroRepository;
import br.com.tomioka.controlevacina.repository.VacinaRepository;

@RestController
@RequestMapping("/aplicacao-vacina")
public class VacinaController {
	
	@Autowired
	VacinaRepository vacinaRepository;
	
	@Autowired
	CadastroRepository cadastroRepository;
	
	@PostMapping
	public ResponseEntity<Void> vacinaCadastro(@RequestBody @Valid VacinaForm form, UriComponentsBuilder uriBuilder) {
		
		Vacina vacina = form.converte(cadastroRepository);
		vacinaRepository.save(vacina);
		
		URI uri = uriBuilder.path("/aplicacao-vacina/{id}").buildAndExpand(vacina.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
}


