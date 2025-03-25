package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_tipo_produto")
public class TipoProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipoProduto", nullable = false)
    private Long id_tipoProduto;

    @Column(name = "descricao", length = 255, nullable = false)
    private String descricao;

    // Construtores
    public TipoProduto() {}

    public TipoProduto(Long id_tipoProduto, String descricao) {
        this.id_tipoProduto = id_tipoProduto;
        this.descricao = descricao;
    }

    // Getters e Setters
    public Long getId_tipoProduto() {
        return id_tipoProduto;
    }

    public void setId_tipoProduto(Long id_tipoProduto) {
        this.id_tipoProduto = id_tipoProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
