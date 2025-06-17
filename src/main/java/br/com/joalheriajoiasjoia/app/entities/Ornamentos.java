package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_ornamentos")
public class Ornamentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ornamentos", nullable = false)
    private Long id;

    @Column(name = "nome_ornamento", nullable = false, length = 100)
    private String nome;

    @Column(name = "descricao_ornamento", length = 255)
    private String descricao;

    public Ornamentos() {
    	
    }

    public Ornamentos(Long id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
