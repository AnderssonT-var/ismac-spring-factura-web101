package com.distribuida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.entities.Cliente;
import com.distribuida.service.ClienteService;

@Controller
@RequestMapping("/clienteS")
public class ClienteCotroller {

	@Autowired
	private ClienteService clienteService;

	@RequestMapping
	public String findAll(Model model) {

		List<Cliente> clientes = clienteService.findAll();
		model.addAttribute("clientes", clientes);
		return "listarClientes";
	}

	@RequestMapping("/frmAdd")
	public String frmAdd() {
		return "AgregarClientes";
	}

	@RequestMapping("/frmDel")
	public String frmDel() {
		return "EliminarClientes";
	}
	
	@GetMapping("/up")
	public String up(@RequestParam("id") int id, Model model) {
		
		Cliente cliente = clienteService.findOne(id);
			
		model.addAttribute("clientes", cliente);
				
		return "AgregarClientes";
	}

}
