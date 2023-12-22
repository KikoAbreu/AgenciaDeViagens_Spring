package br.boralaviagens.services;

import br.boralaviagens.models.Cliente;

import java.util.List;

public interface ClienteService {

    List<Cliente> getAllClientes();

    Cliente getClienteById(Long id);

    Cliente saveCliente(Cliente cliente);

    Cliente updateCliente(Long id, Cliente clienteAtualizado);

    void deleteCliente(Long id);
}
