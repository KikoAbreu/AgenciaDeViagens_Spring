package br.boralaviagens.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Destino {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDestino;
	private String nomeDestino;
	
	//Constructors 
	
	public Destino(Long idDestino, String nomeDestino) {
		super();
		this.idDestino = idDestino;
		this.nomeDestino = nomeDestino;
	}

	public Destino() {

	}
	
	// Getters and Setters
	
	public Long getIdDestino() {
		return idDestino;
	}

	public void setIdDestino(Long idDestino) {
		this.idDestino = idDestino;
	}

	public String getNomeDestino() {
		return nomeDestino;
	}

	public void setNomeDestino(String nomeDestino) {
		this.nomeDestino = nomeDestino;
	}
	
}
