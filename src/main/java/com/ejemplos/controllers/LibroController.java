package com.ejemplos.controllers;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.ejemplos.models.entity.Alimento;
import com.ejemplos.models.service.IAlimentoService;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("alimento")
public class LibroController {
	
	@Autowired
	private IAlimentoService alimentoService;
	
	
	@GetMapping("/")
	public String index() {
		return "redirect:/listar";
		
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		List<Alimento> alimentos = alimentoService.findAll();
		Collections.sort(alimentos);
		model.addAttribute("alimentos",alimentos);
		
		model.addAttribute("titulo","Listado de alimentos");
		return "/listar";
	}
	
}
