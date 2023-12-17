package br.boralaviagens.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReserva;
	private String dataIda;
	private String dataVolta;
	private String id;
	private String idDestino;
		
	// Constructors 
	
	public Reserva(Long idReserva, String dataIda, String dataVolta, String id, String idDestino) {
		super();
		this.idReserva = idReserva;
		this.dataIda = dataIda;
		this.dataVolta = dataVolta;
		this.id = id;
		this.idDestino = idDestino;
	}

	public Reserva() {

	}


	// Getters and Setters 
	
	public Long getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Long idReserva) {
		this.idReserva = idReserva;
	}

	public String getDataIda() {
		return dataIda;
	}

	public void setDataIda(String dataIda) {
		this.dataIda = dataIda;
	}

	public String getDataVolta() {
		return dataVolta;
	}

	public void setDataVolta(String dataVolta) {
		this.dataVolta = dataVolta;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdDestino() {
		return idDestino;
	}

	public void setIdDestino(String idDestino) {
		this.idDestino = idDestino;
	}
	
}
