package br.com.joalheriajoiasjoia.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.joalheriajoiasjoia.app.entities.Usuario;
import br.com.joalheriajoiasjoia.app.services.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    // Criar um novo usuário
    @PostMapping
    public Usuario salvar(@RequestBody Usuario usuario) {
        return usuarioService.salvar(usuario);
    }

    // Buscar um usuário pelo ID
    @GetMapping("/{id}")
    public Usuario buscarPorId(@PathVariable Long id) {
        return usuarioService.getUsuarioById(id); // método atualizado no service
    }

    // Atualizar um usuário
    @PutMapping("/{id}")
    public Usuario atualizar(@PathVariable Long id, @RequestBody Usuario usuarioAtualizado) {
        return usuarioService.atualizar(id, usuarioAtualizado);
    }

    // Excluir um usuário
    @DeleteMapping("/{id}")
    public boolean excluir(@PathVariable Long id) {
        return usuarioService.excluir(id);
    }

    // Listar todos os usuários
    @GetMapping
    public List<Usuario> listarTodos() {
        return usuarioService.listarTodos();
    }

    // Buscar usuário por email
    @GetMapping("/email/{email}")
    public Usuario buscarPorEmail(@PathVariable String email) {
        return usuarioService.buscarPorEmail(email);
    }

    // Método de login
    @PostMapping("/login")
    public Usuario login(@RequestBody Usuario loginRequest) {
        return usuarioService.autenticarUsuario(loginRequest.getEmail(), loginRequest.getSenha());
    }
}
