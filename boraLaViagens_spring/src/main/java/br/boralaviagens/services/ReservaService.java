package br.boralaviagens.services;

import java.util.List;

import br.boralaviagens.model.Reserva;

public interface ReservaService {

	List<Reserva> getAllReservas();
	
	Reserva getReservaById(Long id);
	
	Reserva saveReserva(Reserva reserva);
	
	Reserva updateReserva(Reserva reservaAtualizada);
	
	void deleteReserva(Long id);
}
