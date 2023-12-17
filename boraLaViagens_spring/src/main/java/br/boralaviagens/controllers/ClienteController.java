package br.boralaviagens.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.boralaviagens.model.Cliente;
import br.boralaviagens.services.ClienteService;

import java.util.List;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public String listClientes(Model model) {
		List<Cliente> clientes = clienteService.getAllClientes();
		model.addAttribute("clientes", clientes);
		return "ListarClientes";
	}
	
	@GetMapping("/novo")
	public String showFormForAdd(Model model) {
		Cliente cliente = new Cliente();
		model.addAttribute("cliente", cliente);
		return "cadastro";
	}
	
	//Persistencia Criacao
		@PostMapping("/save")
		public String saveCliente(@ModelAttribute("cliente") Cliente cliente) {
			clienteService.saveCliente(cliente);
			return "redirect:/clientes";
		}
		
		//Formulario edicao candidato
		@GetMapping("/editar/{id}")
		public String showFormForUpdate(@PathVariable Long id, Model model) {
			Cliente cliente = clienteService.getClienteById(id);
			model.addAttribute("cliente",cliente);
			return "editarCliente";
		}
		
		//Persistencia da Edicao
		@PostMapping("/editar/{id}")
		public String updateCliente(@PathVariable Long id, @ModelAttribute("cliente") Cliente cliente) {
			clienteService.updateCliente(id, cliente);
			return "redirect:/clientes";
		}
		
		//Excluir categoria
		@GetMapping("/deletar/{id}")
		public String deleteCliente(@PathVariable Long id) {
			clienteService.deleteCliente(id);
			return "redirect:/clientes";
		}
	
}
