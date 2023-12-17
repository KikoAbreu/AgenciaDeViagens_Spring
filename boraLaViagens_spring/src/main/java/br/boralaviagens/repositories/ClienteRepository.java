package br.boralaviagens.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import br.boralaviagens.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Long> {

}
