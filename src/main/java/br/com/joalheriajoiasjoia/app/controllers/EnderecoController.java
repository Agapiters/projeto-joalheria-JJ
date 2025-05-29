package br.com.joalheriajoiasjoia.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.joalheriajoiasjoia.app.entities.Endereco;
import br.com.joalheriajoiasjoia.app.services.EnderecoService;

@RestController
@RequestMapping("/api/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    // Criar um novo endereço
    @PostMapping
    public Endereco salvarEndereco(@RequestBody Endereco endereco) {
        return enderecoService.salvar(endereco);
    }

    // Listar todos os endereços
    @GetMapping
    public List<Endereco> listarEnderecos() {
        return enderecoService.listarTodos();
    }

    // Buscar endereço por ID
    @GetMapping("/{id}")
    public Endereco buscarEnderecoPorId(@PathVariable Long id) {
        return enderecoService.getEnderecoById(id);
    }

    // Atualizar endereço
    @PutMapping("/{id}")
    public Endereco atualizarEndereco(@PathVariable Long id, @RequestBody Endereco enderecoAtualizado) {
        return enderecoService.atualizar(id, enderecoAtualizado);
    }

    // Deletar endereço por ID
    @DeleteMapping("/{id}")
    public void deletarEndereco(@PathVariable Long id) {
        enderecoService.deletarPorId(id);
    }
}
