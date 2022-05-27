package com.letscode.usuarioAPI.controller;

import com.letscode.usuarioAPI.document.Usuario;
import com.letscode.usuarioAPI.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping
    public Flux<Usuario> getAll(){
        return usuarioService.getAll();
    }

    @GetMapping("/{id}")
    public Mono<Usuario> getUserById(@PathVariable String id){
        return usuarioService.getUserById(id);
    }

    @PostMapping
    public Mono<Usuario> createUsuario (@RequestBody Usuario usuario){
        return usuarioService.createUsuario(usuario);
    }

}
