package br.com.joalheriajoiasjoia.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.joalheriajoiasjoia.app.entities.TipoProduto;
import br.com.joalheriajoiasjoia.app.repositories.TipoProdutoRepository;

import java.util.List;

@Service
public class TipoProdutoService {

    @Autowired
    private TipoProdutoRepository tipoProdutoRepository;

    // Criar ou atualizar um TipoProduto
    public TipoProduto saveTipoProduto(TipoProduto tipoProduto) {
        return tipoProdutoRepository.save(tipoProduto);
    }

    // Obter todos os TipoProdutos
    public List<TipoProduto> getAllTipoProdutos() {
        return tipoProdutoRepository.findAll();
    }

    // Obter um TipoProduto por ID (sem Optional)
    public TipoProduto getTipoProdutoById(Long id) {
        return tipoProdutoRepository.findById(id).orElse(null);
    }

    // Deletar um TipoProduto por ID
    public void deleteTipoProduto(Long id) {
        tipoProdutoRepository.deleteById(id);
    }
}