package br.com.joalheriajoiasjoia.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.joalheriajoiasjoia.app.entities.Ornamentos;
import br.com.joalheriajoiasjoia.app.repositories.OrnamentosRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OrnamentosService {

    @Autowired
    private OrnamentosRepository ornamentosRepository;

    // Criar ou atualizar um Ornamento
    public Ornamentos saveOrnamento(Ornamentos ornamento) {
        return ornamentosRepository.save(ornamento);
    }

    // Obter todos os Ornamentos
    public List<Ornamentos> getAllOrnamentos() {
        return ornamentosRepository.findAll();
    }

    // Obter um Ornamento por ID
    public Ornamentos getOrnamentoById(Long id) {
        Optional<Ornamentos> ornamento = ornamentosRepository.findById(id);
        return ornamento.orElse(null);
    }

    // Deletar um Ornamento por ID
    public void deleteOrnamento(Long id) {
        ornamentosRepository.deleteById(id);
    }
}
