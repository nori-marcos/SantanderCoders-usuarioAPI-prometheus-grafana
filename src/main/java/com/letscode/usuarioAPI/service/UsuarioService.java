package com.letscode.usuarioAPI.service;

import com.letscode.usuarioAPI.document.Usuario;
import com.letscode.usuarioAPI.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public Mono<Usuario> createUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Flux<Usuario> getAll() {
        final var fluxFoundUsers = usuarioRepository.findAll();
        return fluxFoundUsers;
    }

    public Mono<Usuario> getUserById(String id) {
        return usuarioRepository.findById(id)
                .switchIfEmpty(Mono.error(new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found!")));
    }

    public Mono<Void> deleteUserById(String id) {
        return usuarioRepository.deleteById(id);
    }
}
