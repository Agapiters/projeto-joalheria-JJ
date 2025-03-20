package br.com.joalheriajoiasjoia.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joalheriajoiasjoia.app.entities.CategoriaProduto;
import br.com.joalheriajoiasjoia.app.services.CategoriaProdutoService;

@RestController
@RequestMapping("/categoriaProduto")
public class CategoriaProdutoController {

	@Autowired
	private CategoriaProdutoService categoriaProdutoService;

	@PostMapping
	public CategoriaProduto createCategoria(@RequestBody CategoriaProduto categoriaProduto) {
		return CategoriaProdutoService.saveCategoriaProduto(categoriaProduto);
	}
	@GetMapping
	public List<CategoriaProduto> getAllCategoriaProdutos() {
		return categoriaProdutoService.getAllCategoriaProdutos();
	}
	
	@GetMapping("/{id}")
	public CategoriaProduto getCategoriaProduto(@PathVariable Long id) {
		return categoriaProduto.getCategoriaProdutoById(id);
	}
	
	@PutMapping
	public CategoriaProduto editCategoriaProduto(@RequestBody CategoriaProduto categoriaProduto) {
		return CategoriaProdutoService.saveCategoriaProduto(categoriaProduto);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCategoria(@PathVariable Long id) {
	categoriaProdutoService.deleteCategoria(id);
	}
}