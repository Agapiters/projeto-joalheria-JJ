package br.com.joalheriajoiasjoia.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.joalheriajoiasjoia.app.entities.TipoProduto;
import br.com.joalheriajoiasjoia.app.repositories.TipoProdutoRepository;

import java.util.List;
import java.util.Optional;

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

    // Obter um TipoProduto por ID
    public TipoProduto getTipoProdutoById(Long id_tipoProduto) {
        Optional<TipoProduto> tipoProduto = tipoProdutoRepository.findById(id_tipoProduto);
        return tipoProduto.orElse(null);
    }

    // Deletar um TipoProduto por ID
    public void deleteTipoProduto(Long id_tipoProduto) {
        tipoProdutoRepository.deleteById(id_tipoProduto);
    }
}
