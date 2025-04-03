package br.com.joalheriajoiasjoia.app.repositories;

import br.com.joalheriajoiasjoia.app.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
