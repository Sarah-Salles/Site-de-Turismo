package com.exemple.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserDetailsImpl;
import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    final UsuarioRepository usuarioRepository;
    public UserDetailsServiceImpl(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado"));
        return new UserDetailsImpl(usuario);
    }
}