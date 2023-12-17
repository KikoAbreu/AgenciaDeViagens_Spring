package br.boralaviagens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.boralaviagens.model.Destino;

@Repository
public interface Destinorepository extends JpaRepository<Destino, Long>{

}
