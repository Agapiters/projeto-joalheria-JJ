package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_ornamentos")
public class Ornamentos {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ornamento", nullable = false)
    private Long id_ornamento;

    @Column(name = "nome_ornamento", nullable = false, length = 100)
    private String nome;

    @Column(name = "descricao_ornamento", length = 255)
    private String descricao;

    // Construtores
    public Ornamentos() {
    }

    public Ornamentos(Long id_ornamento, String nome, String descricao) {
        this.id_ornamento = id_ornamento;
        this.nome = nome;
        this.descricao = descricao;
    }

    // Getters e Setters
    public Long getId_ornamento() {
        return id_ornamento;
    }

    public void setId_ornamento(Long id_ornamento) {
        this.id_ornamento = id_ornamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
