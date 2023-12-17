package br.boralaviagens.services;

import java.util.List;

import br.boralaviagens.model.Cliente;

public interface ClienteService {

	List<Cliente> getAllClientes();
	
	Cliente getClienteById(Long id);
	
	Cliente saveCliente(Cliente cliente);
	
	Cliente updateCliente(Long id, Cliente clienteAtualizado);
	
	void deleteCliente(Long id);
}
