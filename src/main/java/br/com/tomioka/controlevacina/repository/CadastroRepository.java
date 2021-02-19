package br.com.tomioka.controlevacina.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tomioka.controlevacina.modelo.Cadastro;

public interface CadastroRepository extends JpaRepository<Cadastro, Long> {

	Cadastro findByEmail(String email);

}

