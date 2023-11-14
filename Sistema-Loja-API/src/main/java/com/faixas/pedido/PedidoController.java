/**
 * 
 */
package com.faixas.pedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping(path = "/pedido") 
public class PedidoController {
	@Autowired 
	private PedidoRepository pedidoRepository;

	@PostMapping(path = "/add") 
	public @ResponseBody String addNewPedido(Pedido pedido) {
		

		try {
			pedidoRepository.save(pedido);
			return "Pedido Adicionado com Sucesso!";
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	@DeleteMapping(path = "/delete")
	public @ResponseBody String deletePedido(Integer id) {
		
		Pedido pedido = pedidoRepository.findById(id).get();
		
		try {
			pedidoRepository.delete(pedido);
			return "Pedido Deletado com Sucesso!";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Pedido> getAllPedidos() {
		
		return pedidoRepository.findAll();
	}
}