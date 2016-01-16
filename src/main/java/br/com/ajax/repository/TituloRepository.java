package br.com.ajax.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ajax.model.Titulo;

public interface TituloRepository extends JpaRepository<Titulo, Long> {

}
