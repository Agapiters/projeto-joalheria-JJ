package br.com.joalheriajoiasjoia.app.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto {
	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProduto", nullable = false)
	private long idProduto;

	@Column(name = "nomeProduto", nullable = false)
	private String nomeProduto;

	@Column(name = "descricao", nullable = false)
	private String descricao;

	@Column(name = "preco", nullable = false)
	private String preco;

	@Column(name = "img", nullable = false)
	private String img;
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "ornamentoProduto", nullable = false)
	private Ornamentos ornamentos;
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "categoriaProduto", nullable = false)
	private CategoriaProduto categoriaProduto;
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "tipoProduto", nullable = false)
	private TipoProduto tipoProduto;
	
	//Construtores
	public Produto() {
	}
	
	public Produto(long idProduto, String nomeProduto, String descricao, String preco, String img,
			CategoriaProduto categoriaProduto, TipoProduto tipoProduto, Ornamentos ornamentos) {
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.descricao = descricao;
		this.preco = preco;
		this.img = img;
		this.categoriaProduto = categoriaProduto;
		this.tipoProduto = tipoProduto;
		this.ornamentos = ornamentos;
	}
	
	//Getters e Setters
	public long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public CategoriaProduto getCategoriaProduto() {
		return categoriaProduto;
	}

	public void setCategoriaProduto(CategoriaProduto categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}

	public TipoProduto getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(TipoProduto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	
	public Ornamentos getOrnamentos() {
		return ornamentos;
	}

	public void setOrnamentos(Ornamentos ornamentos) {
		this.ornamentos = ornamentos;
	}
	
	
	
}