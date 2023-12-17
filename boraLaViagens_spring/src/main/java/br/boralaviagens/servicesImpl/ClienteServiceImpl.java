package br.boralaviagens.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.boralaviagens.model.Cliente;
import br.boralaviagens.repositories.ClienteRepository;
import br.boralaviagens.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	
	@Override
	public List<Cliente> getAllClientes() {
		return clienteRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente getClienteById(Long id) {
		return clienteRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Cliente saveCliente(Cliente cliente) {	
		return clienteRepository.save(cliente);
	}

	@Override
	public Cliente updateCliente(Long id, Cliente clienteAtualizado) {
		Cliente clienteExistente = clienteRepository.findById(id).orElse(null);
		if (clienteExistente != null) {
			clienteExistente.setNome(clienteAtualizado.getNome());
			clienteExistente.setEmail(clienteAtualizado.getEmail());
			clienteExistente.setSenha(clienteAtualizado.getSenha());
			return clienteRepository.save(clienteExistente);
		} else
			throw new RuntimeException ("Cliente com o id:" + id + "nao encontrado!"); 
	}

	@Override
	public void deleteCliente(Long id) {
		clienteRepository.deleteById(id);
	}

}
