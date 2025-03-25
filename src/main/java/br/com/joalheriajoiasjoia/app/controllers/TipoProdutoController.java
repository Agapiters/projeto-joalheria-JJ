package br.com.joalheriajoiasjoia.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.joalheriajoiasjoia.app.entities.TipoProduto;
import br.com.joalheriajoiasjoia.app.services.TipoProdutoService;

import java.util.List;

@RestController
@RequestMapping("/tiposProduto")
public class TipoProdutoController {

    @Autowired
    private TipoProdutoService tipoProdutoService;

    // Criar um novo TipoProduto
    @PostMapping
    public TipoProduto createTipoProduto(@RequestBody TipoProduto tipoProduto) {
        return tipoProdutoService.saveTipoProduto(tipoProduto);
    }

    // Obter todos os TipoProdutos
    @GetMapping
    public List<TipoProduto> getAllTipoProdutos() {
        return tipoProdutoService.getAllTipoProdutos();
    }

    // Obter um TipoProduto específico por ID
    @GetMapping("/{id_tipoProduto}")
    public TipoProduto getTipoProduto(@PathVariable Long id_tipoProduto) {
        return tipoProdutoService.getTipoProdutoById(id_tipoProduto);
    }

    // Atualizar um TipoProduto existente
    @PutMapping
    public TipoProduto updateTipoProduto(@RequestBody TipoProduto tipoProduto) {
        return tipoProdutoService.saveTipoProduto(tipoProduto);
    }

    // Deletar um TipoProduto por ID
    @DeleteMapping("/{id_tipoProduto}")
    public void deleteTipoProduto(@PathVariable Long id_tipoProduto) {
        tipoProdutoService.deleteTipoProduto(id_tipoProduto);
    }
}
