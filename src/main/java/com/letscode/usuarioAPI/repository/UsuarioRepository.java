package com.letscode.usuarioAPI.repository;

import com.letscode.usuarioAPI.document.Usuario;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UsuarioRepository extends ReactiveCrudRepository<Usuario, String> {
}
