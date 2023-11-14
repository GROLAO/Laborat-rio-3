
package com.faixas.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.faixas.pedido.Pedido;

@Controller
@RequestMapping(path = "/cliente")
public class ClienteController {
	@Autowired 
	private ClienteRepository clienteRepository;

	@PostMapping(path = "/add") 
	public @ResponseBody String addNewCliente(Cliente cliente) {
		

		try {
			clienteRepository.save(cliente);
			return "Cliente Deletado com Sucesso!";
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	@DeleteMapping(path = "/delete")
	public @ResponseBody String deletePedido(Integer id) {
		
		Cliente cliente = clienteRepository.findById(id).get();
		
		try {
			clienteRepository.delete(cliente);
			return "Cliente Deletado com Sucesso!";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Cliente> getAllClientes() {
		
		return clienteRepository.findAll();
	}
}