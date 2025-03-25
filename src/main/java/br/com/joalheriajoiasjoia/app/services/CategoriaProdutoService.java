package br.com.joalheriajoiasjoia.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.CategoriaProduto;
import br.com.joalheriajoiasjoia.app.repositories.CategoriaProdutoRepository;

@Service
public class CategoriaProdutoService {

    @Autowired
    private CategoriaProdutoRepository categoriaProdutoRepository;

    // Salvar ou atualizar uma CategoriaProduto
    public CategoriaProduto saveCategoriaProduto(CategoriaProduto categoriaProduto) {
        return categoriaProdutoRepository.save(categoriaProduto);
    }

    // Obter todas as CategoriaProduto
    public List<CategoriaProduto> getAllCategoriaProdutos() {
        return categoriaProdutoRepository.findAll();
    }

    // Obter uma CategoriaProduto pelo ID
    public CategoriaProduto getCategoriaProdutoById(Long id) {
        Optional<CategoriaProduto> categoriaProduto = categoriaProdutoRepository.findById(id);
        return categoriaProduto.orElseThrow(() -> new RuntimeException("CategoriaProduto não encontrada"));
    }

    // Deletar uma CategoriaProduto por ID
    public void deleteCategoria(Long id) {
        categoriaProdutoRepository.deleteById(id);
    }
}