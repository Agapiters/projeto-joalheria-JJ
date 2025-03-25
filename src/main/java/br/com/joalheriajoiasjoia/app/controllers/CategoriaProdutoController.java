package br.com.joalheriajoiasjoia.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joalheriajoiasjoia.app.entities.CategoriaProduto;
import br.com.joalheriajoiasjoia.app.services.CategoriaProdutoService;

@RestController
@RequestMapping("/categoriaProduto")
public class CategoriaProdutoController {

    @Autowired
    private CategoriaProdutoService categoriaProdutoService;

    // Criar uma nova CategoriaProduto
    @PostMapping
    public CategoriaProduto createCategoria(@RequestBody CategoriaProduto categoriaProduto) {
        return categoriaProdutoService.saveCategoriaProduto(categoriaProduto);
    }

    // Obter todas as CategoriaProduto
    @GetMapping
    public List<CategoriaProduto> getAllCategoriaProdutos() {
        return categoriaProdutoService.getAllCategoriaProdutos();
    }

    // Obter uma CategoriaProduto específica por ID
    @GetMapping("/{id}")
    public CategoriaProduto getCategoriaProduto(@PathVariable Long id) {
        return categoriaProdutoService.getCategoriaProdutoById(id);
    }

    // Editar uma CategoriaProduto existente
    @PutMapping
    public CategoriaProduto editCategoriaProduto(@RequestBody CategoriaProduto categoriaProduto) {
        return categoriaProdutoService.saveCategoriaProduto(categoriaProduto);
    }

    // Deletar uma CategoriaProduto por ID
    @DeleteMapping("/{id}")
    public void deleteCategoria(@PathVariable Long id) {
        categoriaProdutoService.deleteCategoria(id);
    }
}
