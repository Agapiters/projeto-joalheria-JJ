package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tipo_produto")
public class TipoProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_produto", nullable = false)
    private long idTipoProduto;

    @Column(name = "nome_tipo_produto", nullable = false)
    private String nomeTipoProduto;

    @Column(name = "descricao_tipo_produto", nullable = false)
    private String descricaoTipoProduto;

    // Construtores
    public TipoProduto() {
    }

    public TipoProduto(long idTipoProduto, String nomeTipoProduto, String descricaoTipoProduto) {
        this.idTipoProduto = idTipoProduto;
        this.nomeTipoProduto = nomeTipoProduto;
        this.descricaoTipoProduto = descricaoTipoProduto;
    }

    // Getters e Setters
    public long getIdTipoProduto() {
        return idTipoProduto;
    }

    public void setIdTipoProduto(long idTipoProduto) {
        this.idTipoProduto = idTipoProduto;
    }

    public String getNomeTipoProduto() {
        return nomeTipoProduto;
    }

    public void setNomeTipoProduto(String nomeTipoProduto) {
        this.nomeTipoProduto = nomeTipoProduto;
    }

    public String getDescricaoTipoProduto() {
        return descricaoTipoProduto;
    }

    public void setDescricaoTipoProduto(String descricaoTipoProduto) {
        this.descricaoTipoProduto = descricaoTipoProduto;
    }
}
