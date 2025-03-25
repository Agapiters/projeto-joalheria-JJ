package br.com.joalheriajoiasjoia.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.joalheriajoiasjoia.app.entities.Ornamentos;
import br.com.joalheriajoiasjoia.app.services.OrnamentosService;

import java.util.List;

@RestController
@RequestMapping("/ornamentos")
public class OrnamentosController {

    @Autowired
    private OrnamentosService ornamentosService;

    // Criar um novo Ornamento
    @PostMapping
    public Ornamentos createOrnamento(@RequestBody Ornamentos ornamento) {
        return ornamentosService.saveOrnamento(ornamento);
    }

    // Obter todos os Ornamentos
    @GetMapping
    public List<Ornamentos> getAllOrnamentos() {
        return ornamentosService.getAllOrnamentos();
    }

    // Obter um Ornamento específico por ID
    @GetMapping("/{id}")
    public Ornamentos getOrnamento(@PathVariable Long id) {
        return ornamentosService.getOrnamentoById(id);
    }

    // Atualizar um Ornamento existente
    @PutMapping
    public Ornamentos updateOrnamento(@RequestBody Ornamentos ornamento) {
        return ornamentosService.saveOrnamento(ornamento);
    }

    // Deletar um Ornamento por ID
    @DeleteMapping("/{id}")
    public void deleteOrnamento(@PathVariable Long id) {
        ornamentosService.deleteOrnamento(id);
    }
}
