package br.com.joalheriajoiasjoia.app.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tipo_produto")
public class TipoProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTipoProduto", nullable = false)
    private long idTipoProduto;

    @Column(name = "nomeTipoProduto", nullable = false)
    private String nomeTipoProduto;

    @Column(name = "descricaoTipoProduto", nullable = false)
    private String descricaoTipoProduto;
    
    @OneToMany(mappedBy = "tipoProduto")
    @JsonManagedReference
    private List<Produto> produtos;

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

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
