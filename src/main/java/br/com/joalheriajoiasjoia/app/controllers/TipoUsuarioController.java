package br.com.joalheriajoiasjoia.app.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joalheriajoiasjoia.app.entities.TipoUsuario;
import br.com.joalheriajoiasjoia.app.services.TipoUsuarioService;

@RestController
@RequestMapping("/tipos-usuario")
public class TipoUsuarioController {

    @Autowired
    private TipoUsuarioService tipoUsuarioService;

    @GetMapping
    public List<TipoUsuario> listarTodos() {
        return tipoUsuarioService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoUsuario> buscarPorId(@PathVariable Long id) {
        Optional<TipoUsuario> tipoUsuario = tipoUsuarioService.buscarPorId(id);
        return tipoUsuario.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public TipoUsuario salvar(@RequestBody TipoUsuario tipoUsuario) {
        return tipoUsuarioService.salvar(tipoUsuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        tipoUsuarioService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
