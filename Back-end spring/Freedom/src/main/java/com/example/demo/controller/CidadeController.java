package com.example.demo.controller;

import java.util.List;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Cidade;
import com.example.demo.repository.CidadeRepository;

@Controller
@RequestMapping("/admin/cidade")
public class CidadeController {

	private CidadeRepository cidadeRepository;

	public CidadeController(CidadeRepository cidadeRepository) {
		super();
		this.cidadeRepository = cidadeRepository;
	}

	@GetMapping("/select")
	public String select(Model model) {
		List<Cidade> cidades = cidadeRepository.findAll();
		model.addAttribute("cidades", cidades);
		model.addAttribute("cidade", new Cidade());
		return "/adminCidade";

	}

	@PostMapping("/insert")
	public String insert(@ModelAttribute Cidade cidade) {
		cidadeRepository.save(cidade);
		return "redirect:/admin/cidade/select";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable(name = "id") Long id) {
		try {
			cidadeRepository.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/admin/cidade/select";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(Model model, @PathVariable(name = "id") Long id) {
		Cidade cidade = cidadeRepository.findById(id)
			.orElseThrow(()-> new UsernameNotFoundException("Cidade não encontrada"));
		model.addAttribute("cidade",cidade);
		return "alterarCidade";
	}
	@PostMapping("/update")
	public String update(@ModelAttribute Cidade cidade){
		try {
			cidadeRepository.save(cidade);
		}catch (Exception e){e.printStackTrace();
		}
		return "redirect:/admin/cidade/select";
	}
}
