package br.com.joalheriajoiasjoia.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.joalheriajoiasjoia.app.entities.Produto;
import br.com.joalheriajoiasjoia.app.services.ProdutoService;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    // Criar um novo Produto
    @PostMapping
    public Produto createProduto(@RequestBody Produto produto) {
        return produtoService.saveProduto(produto);
    }

    // Obter todos os Produtos
    @GetMapping
    public List<Produto> getAllProdutos() {
        return produtoService.getAllProdutos();
    }

    // Obter um Produto específico por ID
    @GetMapping("/{id}")
    public Produto getProduto(@PathVariable Long id) {
        return produtoService.getProdutoById(id);
    }

    // Atualizar um Produto existente
    @PutMapping
    public Produto updateProduto(@RequestBody Produto produto) {
        return produtoService.saveProduto(produto);
    }

    // Deletar um Produto por ID
    @DeleteMapping("/{id}")
    public void deleteProduto(@PathVariable Long id) {
        produtoService.deleteProduto(id);
    }
}
