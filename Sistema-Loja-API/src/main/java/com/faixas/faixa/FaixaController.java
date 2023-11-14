
package com.faixas.faixa;

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
@RequestMapping(path = "/faixa") 
public class FaixaController {
	@Autowired 
	private FaixaRepository faixaRepository;

	@PostMapping(path = "/add") 
	public @ResponseBody String addNewFaixa(Faixa faixa) {
		

		try {
			faixaRepository.save(faixa);
			return "Faixa Adicionada com Sucesso!";
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	@DeleteMapping(path = "/delete")
	public @ResponseBody String deletePedido(Integer id) {
		
		Faixa faixa = faixaRepository.findById(id).get();
		
		try {
			faixaRepository.delete(faixa);
			return "Faixa Deletada com Sucesso!";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Faixa> getAllFaixas() {
		
		return faixaRepository.findAll();
	}
}