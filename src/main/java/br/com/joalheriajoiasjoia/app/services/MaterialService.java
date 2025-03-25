package br.com.joalheriajoiasjoia.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.joalheriajoiasjoia.app.entities.Material;
import br.com.joalheriajoiasjoia.app.repositories.MaterialRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MaterialService {

    @Autowired
    private MaterialRepository materialRepository;

    // Criar ou atualizar um Material
    public Material saveMaterial(Material material) {
        return materialRepository.save(material);
    }

    // Obter todos os Materiais
    public List<Material> getAllMateriais() {
        return materialRepository.findAll();
    }

    // Obter um Material por ID
    public Material getMaterialById(Long id) {
        Optional<Material> material = materialRepository.findById(id);
        return material.orElse(null);
    }

    // Deletar um Material por ID
    public void deleteMaterial(Long id) {
        materialRepository.deleteById(id);
    }
}
