package com.distribuida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.entities.Cliente;
import com.distribuida.service.ClienteService;
import com.eventos.entities.Eventos;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@RequestMapping
	public String findAll(Model model) {

		List<Cliente> clientes = clienteService.findAll();

		model.addAttribute("clientes", clientes);

		return "listarClientes";
	}

	@GetMapping("/findOne")
	public String findOne(@RequestParam("idCliente") int id, @RequestParam("opcion") int opcion, Model model) {
		Cliente cliente = clienteService.findOne(id);

		if (opcion == 1) {
			model.addAttribute("cliente", cliente);
			return "AgregarClientes";
		} else {
			model.addAttribute("cliente", cliente);
			return "EliminarClientes";
		}

	}

	@PostMapping("/add")
	public String add(@ModelAttribute("cliente") Cliente cliente, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "AgregarClientes";
		} else {
			clienteService.add(cliente);
			return "redirect:/clientes";
		}

	}

	
	@GetMapping("/up")
	public String up(@RequestParam("id") int id, Model model) {
		
		Cliente cliente = clienteService.findOne(id);
			
		model.addAttribute("clientes", cliente);
				
		return "AgregarClientes";
	}	
		
	@GetMapping("/del")
	public String frmDel(@ModelAttribute("cliente") Cliente cliente) {
		clienteService.del(cliente.getIdCliente());
		return "redirect:/clientes";
	}

	@RequestMapping("/frmAdd")
	public String frmAdd(Model model) {
		Cliente cliente = new Cliente();
		model.addAttribute("cliente", cliente);
		return "AgregarClientes";
	}

	@InitBinder
	public void miBinder(WebDataBinder binder) {
		StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, trimmerEditor);
	}

}
