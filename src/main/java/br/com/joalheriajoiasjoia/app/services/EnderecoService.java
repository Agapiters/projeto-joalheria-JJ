package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Endereco;
import br.com.joalheriajoiasjoia.app.repositories.EnderecoRepository;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    // Salvar ou atualizar um endereço
    public Endereco salvar(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    // Listar todos os endereços
    public List<Endereco> listarTodos() {
        return enderecoRepository.findAll();
    }

    // Buscar endereço por ID (retorna null se não encontrar)
    public Endereco getEnderecoById(Long id) {
        return enderecoRepository.findById(id).orElse(null);
    }

    // Atualizar endereço
    public Endereco atualizar(Long id, Endereco enderecoAtualizado) {
        Endereco endereco = enderecoRepository.findById(id).orElse(null);
        if (endereco != null) {
            endereco.setCep(enderecoAtualizado.getCep());
            endereco.setNomeRua(enderecoAtualizado.getNomeRua());
            endereco.setNumeroCasa(enderecoAtualizado.getNumeroCasa());
            endereco.setBairro(enderecoAtualizado.getBairro());
            endereco.setCidade(enderecoAtualizado.getCidade());
            endereco.setEstado(enderecoAtualizado.getEstado());

            return enderecoRepository.save(endereco);
        }
        return null; // ou lançar exceção, conforme sua regra de negócio
    }

    // Deletar endereço por ID
    public void deletarPorId(Long id) {
        enderecoRepository.deleteById(id);
    }
}
