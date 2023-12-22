package br.boralaviagens.controllers;

import br.boralaviagens.models.Cliente;
import br.boralaviagens.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public String listClientes(Model model) {
        List<Cliente> clientes = clienteService.getAllClientes();
        model.addAttribute("clientes", clientes);
        return "ListarClientes";
    }

    @GetMapping("/novo")
    public String showFormForAdd(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "NovoCliente";
    }

    @PostMapping("/save")
    public String saveCliente(@ModelAttribute("cliente") Cliente cliente) {
        clienteService.saveCliente(cliente);
        return "redirect:/clientes";
    }

    @GetMapping("/editar/{id}")
    public String showFormForUpdate(@PathVariable Long id, Model model) {
        Cliente cliente = clienteService.getClienteById(id);
        model.addAttribute("cliente", cliente);
        return "editarCliente";
    }

    @PostMapping("/editar/{id}")
    public String updateCliente(@PathVariable Long id, @ModelAttribute("cliente") Cliente cliente) {
        clienteService.updateCliente(id, cliente);
        return "redirect:/clientes";
    }

    @GetMapping("/deletar/{id}")
    public String deleteCliente(@PathVariable Long id) {
        clienteService.deleteCliente(id);
        return "redirect:/clientes";
    }
}
