package br.com.joalheriajoiasjoia.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.joalheriajoiasjoia.app.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	//ta pra encontrar por nome de usuário
		Usuario findByNomeUsuario(String nomeUsuario);
		
		//consulta para encontrar por email
		Usuario findByEmail(String email);
}