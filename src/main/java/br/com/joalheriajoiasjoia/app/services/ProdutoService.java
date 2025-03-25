package br.com.joalheriajoiasjoia.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.joalheriajoiasjoia.app.entities.Produto;
import br.com.joalheriajoiasjoia.app.repositories.ProdutoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    // Criar ou atualizar um Produto
    public Produto saveProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    // Obter todos os Produtos
    public List<Produto> getAllProdutos() {
        return produtoRepository.findAll();
    }

    // Obter um Produto por ID
    public Produto getProdutoById(Long id) {
        Optional<Produto> produto = produtoRepository.findById(id);
        return produto.orElse(null);
    }

    // Deletar um Produto por ID
    public void deleteProduto(Long id) {
        produtoRepository.deleteById(id);
    }
}
