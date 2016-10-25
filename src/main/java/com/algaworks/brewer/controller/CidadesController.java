package com.algaworks.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.algaworks.brewer.model.Cidade;

@Controller
public class CidadesController {

	@RequestMapping("/cidades/nova")
	public String novo(Cidade cidade) {
		return "/cidade/CadastroCidade";
	}
	
	@RequestMapping(value = "/cidades/nova", method = RequestMethod.POST)
	public String cadastrar(Cidade cidade, BindingResult result, Model model, RedirectAttributes redirectAttr) {
		if (result.hasErrors()) {
			return "/cidade/CadastroCidade";
			//treat errors as well
		} else {
			return novo(cidade);
		}
	}
	
}
