package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_categoria_produto")
public class CategoriaProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCategoriaProduto", nullable = false)
    private long idCategoriaProduto;

    @Column(name = "nome_categoria_produto", nullable = false)
    private String nomeCategoriaProduto;

    @Column(name = "descricao_categoria_produto", nullable = false)
    private String descricaoCategoria;

    public CategoriaProduto() {}

    public CategoriaProduto(long idCategoriaProduto, String nomeCategoriaProduto, String descricaoCategoria) {
        this.idCategoriaProduto = idCategoriaProduto;
        this.nomeCategoriaProduto = nomeCategoriaProduto;
        this.descricaoCategoria = descricaoCategoria;
    }

    public long getIdCategoriaProduto() {
        return idCategoriaProduto;
    }

    public void setIdCategoriaProduto(long idCategoriaProduto) {
        this.idCategoriaProduto = idCategoriaProduto;
    }

    public String getNomeCategoriaProduto() {
        return nomeCategoriaProduto;
    }

    public void setNomeCategoriaProduto(String nomeCategoriaProduto) {
        this.nomeCategoriaProduto = nomeCategoriaProduto;
    }

    public String getDescricaoCategoria() {
        return descricaoCategoria;
    }

    public void setDescricaoCategoria(String descricaoCategoria) {
        this.descricaoCategoria = descricaoCategoria;
    }
}
