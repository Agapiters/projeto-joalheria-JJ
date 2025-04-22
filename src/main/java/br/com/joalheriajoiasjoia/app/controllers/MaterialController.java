package br.com.joalheriajoiasjoia.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.joalheriajoiasjoia.app.entities.Material;
import br.com.joalheriajoiasjoia.app.services.MaterialService;

@RestController
@RequestMapping("/materiais")
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @PostMapping
    public Material createMaterial(@RequestBody Material material) {
        return materialService.saveMaterial(material);
    }

    @GetMapping
    public List<Material> getAllMateriais() {
        return materialService.getAllMateriais();
    }

    @GetMapping("/{id}")
    public Material getMaterial(@PathVariable Long id) {
        return materialService.getMaterialById(id);
    }

    @PutMapping
    public Material updateMaterial(@RequestBody Material material) {
        return materialService.saveMaterial(material);
    }

    @DeleteMapping("/{id}")
    public void deleteMaterial(@PathVariable Long id) {
        materialService.deleteMaterial(id);
    }
}
