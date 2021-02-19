package br.com.tomioka.controlevacina.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tomioka.controlevacina.modelo.Vacina;

public interface VacinaRepository extends JpaRepository<Vacina, Long> {

}


