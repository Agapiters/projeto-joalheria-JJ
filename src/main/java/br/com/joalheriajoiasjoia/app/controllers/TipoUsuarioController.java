package br.com.joalheriajoiasjoia.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.joalheriajoiasjoia.app.entities.TipoUsuario;
import br.com.joalheriajoiasjoia.app.services.TipoUsuarioService;

@RestController
@RequestMapping("/tiposusuario")
public class TipoUsuarioController {

    @Autowired
    private TipoUsuarioService tipoUsuarioService;

    @GetMapping
    public List<TipoUsuario> listarTodos() {
        return tipoUsuarioService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoUsuario> buscarPorId(@PathVariable Long id) {
        TipoUsuario tipoUsuario = tipoUsuarioService.getTipoUsuarioById(id);
        if (tipoUsuario != null) {
            return ResponseEntity.ok(tipoUsuario);
        } else {
            return ResponseEntity.notFound().build();
        }
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
