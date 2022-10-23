package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.enums.RoleName;
import com.example.demo.model.Cargo;
import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;
import com.example.demo.utils.PasswordEncoderUtils;

@Controller
@RequestMapping(path = "/pages")
public class PagesController {
	private UsuarioRepository usuarioRepository;
	
	public PagesController(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}

	@GetMapping(path = { "", "/", "/index" })
	public String index() {
		return "index";
	}

	@GetMapping(path = "/promocoes")
	public String promocoes() {
		return "promoções";
	}

	@GetMapping(path = "/destino")
	public String destino() {
		return "destino";
	}

	@GetMapping(path = "/contato")
	public String contato() {
		return "contato";
	}

	@GetMapping(path = "/login")
	public String login() {
		return "login";
	}

	@GetMapping(path = "/signup")
	public String signup(Model model) {
		model.addAttribute("usuario",new Usuario());
		return "signup";
	}

	@PostMapping("/signup")
	public String signup(@ModelAttribute Usuario usuario) {
		System.out.print(usuario.getPassword());
		String passwordEncoder = PasswordEncoderUtils.encode(usuario.getPassword());
		usuario.setPassword(passwordEncoder);
		Cargo cargo = new Cargo();
		cargo.setId(2);
		cargo.setNome(RoleName.ROLE_ADMIN);
		usuario.setCargo(cargo);
		usuarioRepository.save(usuario);
		return "redirect:/pages/login";
	}
}
