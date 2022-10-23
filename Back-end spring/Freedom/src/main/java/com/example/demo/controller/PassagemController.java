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
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Passagem;
import com.example.demo.repository.CidadeRepository;
import com.example.demo.repository.PassagemRepository;
@Controller
@RequestMapping("/admin/passagem")
public class PassagemController {

	private PassagemRepository passagemRepository;
	private CidadeRepository cidadeRepository;

	

	public PassagemController(PassagemRepository passagemRepository, CidadeRepository cidadeRepository) {
		super();
		this.passagemRepository = passagemRepository;
		this.cidadeRepository = cidadeRepository;
	}

	@GetMapping("/select")
	public String select(Model model) {
		List<Passagem> passagens = passagemRepository.findAll();
		model.addAttribute("passagens", passagens);
		model.addAttribute("passagem", new Passagem());
		return "/adminPassagem";

	}

	@PostMapping("/insert")
	public String insert(@ModelAttribute Passagem passagem,@RequestParam("idCidade") Long idCidade) {
		System.out.print(idCidade);
		passagem.setCidade(cidadeRepository.findById(idCidade).get());
		passagemRepository.save(passagem);
		return "redirect:/admin/passagem/select";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable(name = "id") Long id) {
		try {
			passagemRepository.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/admin/passagem/select";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(Model model, @PathVariable(name = "id") Long id) {
		Passagem passagem = passagemRepository.findById(id)
			.orElseThrow(()-> new UsernameNotFoundException("Passagem não encontrada"));
		model.addAttribute("passagem",passagem);
		return "alterarPassagem";
	}
	@PostMapping("/update")
	public String update(@ModelAttribute Passagem passagem,@RequestParam("idCidade") Long idCidade){
		
		try {
			passagem.setCidade(cidadeRepository.findById(idCidade).get());
			passagemRepository.save(passagem);
		}catch (Exception e){e.printStackTrace();
		}
		return "redirect:/admin/passagem/select";
	}
}

