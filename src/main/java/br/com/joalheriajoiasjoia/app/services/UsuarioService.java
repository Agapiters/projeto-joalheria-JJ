package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Usuario;
import br.com.joalheriajoiasjoia.app.repositories.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Criar um novo usuário
    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Buscar um usuário pelo ID (sem Optional)
    public Usuario getUsuarioById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    // Atualizar os dados de um usuário
    public Usuario atualizar(Long id, Usuario usuarioAtualizado) {
        if (usuarioRepository.existsById(id)) {
            usuarioAtualizado.setIdUsuario(id);
            return usuarioRepository.save(usuarioAtualizado);
        }
        return null; // Retorna null se o usuário não for encontrado
    }

    // Excluir um usuário
    public boolean excluir(Long id) {
        if (usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
            return true;
        }
        return false; // Retorna false se o usuário não for encontrado
    }

    // Listar todos os usuários
    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    // Buscar um usuário por email
    public Usuario buscarPorEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

    // Autenticar usuário por email e senha
    public Usuario autenticarUsuario(String email, String senha) {
        Usuario usuario = usuarioRepository.findByEmail(email);

        // Verifica se o usuário existe e se a senha está correta
        if (usuario != null && usuario.getSenha().equals(senha)) {
            return usuario;
        }
        return null;
    }
}
