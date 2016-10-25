package com.algaworks.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.algaworks.brewer.model.Usuario;

@Controller
public class UsuariosController {

	@RequestMapping("/usuarios/novo")
	public String novo(Usuario usuario) {
		return "/usuario/CadastroUsuario";
	}
	
	@RequestMapping(value = "/usuarios/novo", method = RequestMethod.POST)
	public String cadastrar(Usuario usuario, BindingResult result, Model model, RedirectAttributes redirectAttr) {
		if (result.hasErrors()) {
			return "/usuario/CadastroUsuario";
			//treat the errors as well
		} else {
			return novo(usuario);
		}
	}
}
