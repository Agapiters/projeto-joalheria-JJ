package br.com.joalheriajoiasjoia.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.joalheriajoiasjoia.app.entities.Material;
import br.com.joalheriajoiasjoia.app.services.MaterialService;

import java.util.List;

@RestController
@RequestMapping("/materiais")
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    // Criar um novo Material
    @PostMapping
    public Material createMaterial(@RequestBody Material material) {
        return materialService.saveMaterial(material);
    }

    // Obter todos os Materiais
    @GetMapping
    public List<Material> getAllMateriais() {
        return materialService.getAllMateriais();
    }

    // Obter um Material específico por ID
    @GetMapping("/{id}")
    public Material getMaterial(@PathVariable Long id) {
        return materialService.getMaterialById(id);
    }

    // Atualizar um Material existente
    @PutMapping
    public Material updateMaterial(@RequestBody Material material) {
        return materialService.saveMaterial(material);
    }

    // Deletar um Material por ID
    @DeleteMapping("/{id}")
    public void deleteMaterial(@PathVariable Long id) {
        materialService.deleteMaterial(id);
    }
}
