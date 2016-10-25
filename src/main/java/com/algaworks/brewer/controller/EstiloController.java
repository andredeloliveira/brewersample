package com.algaworks.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.algaworks.brewer.model.Estilo;

@Controller
public class EstiloController {

	@RequestMapping("/estilos/novo")
	public String novo(Estilo estilo) {
		return "/estilo/CadastroEstilo";
	}
	
	@RequestMapping(value = "/estilos/novo", method= RequestMethod.POST)
	public String cadastrar(Estilo estilo, Model model, BindingResult result, RedirectAttributes redirectAttr) {
		if (result.hasErrors()) {
			return "/estilo/CadastroEstilo";
			//treat errors here...
		} else {
			return novo(estilo);
		}
	}
}
