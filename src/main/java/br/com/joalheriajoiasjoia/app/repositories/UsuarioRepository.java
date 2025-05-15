package br.com.joalheriajoiasjoia.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joalheriajoiasjoia.app.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Busca o usuário pelo email
    Usuario findByEmail(String email);
}
