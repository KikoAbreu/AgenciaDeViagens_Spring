package br.boralaviagens.servicesImpl;

import br.boralaviagens.models.Cliente;
import br.boralaviagens.repositories.ClienteRepository;
import br.boralaviagens.services.ClienteService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteImpl implements ClienteService {

    ClienteRepository clienteRepository;

    @Override
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    @Override
    @Transactional
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
            return clienteRepository.save(clienteAtualizado);
        } else {
            throw new RuntimeException("Candidato nao encontrado!");
        }
    }

    @Override
    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
