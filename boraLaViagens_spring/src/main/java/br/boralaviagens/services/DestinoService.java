package br.boralaviagens.services;

import java.util.List;

import br.boralaviagens.model.Destino;

public interface DestinoService {
	
	List<Destino> getAllDestinos();
	
	Destino getDestinoById(Long id);
	
	Destino saveDestino(Destino destino);
	
	Destino updateDestino(Destino destinoAtualizado);
	
	void deleteDestino(Long id);

}
