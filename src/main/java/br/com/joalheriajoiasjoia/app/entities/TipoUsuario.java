package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_tipo_usuario")
public class TipoUsuario {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_usuario", nullable = false)
    private long id_tipo_usuario;

    @Column(name = "nome_tipo_usuario", nullable = false)
    private String nome_tipo_usuario;

    // Construtores
    public TipoUsuario() {
    }

    public TipoUsuario(long id_tipo_usuario, String nome_tipo_usuario) {
        this.id_tipo_usuario = id_tipo_usuario;
        this.nome_tipo_usuario = nome_tipo_usuario;
    }

    // Getters e Setters
    public long getId_tipo_usuario() {
        return id_tipo_usuario;
    }

    public void setId_tipo_usuario(long id_tipo_usuario) {
        this.id_tipo_usuario = id_tipo_usuario;
    }

    public String getNome_tipo_usuario() {
        return nome_tipo_usuario;
    }

    public void setNome_tipo_usuario(String nome_tipo_usuario) {
        this.nome_tipo_usuario = nome_tipo_usuario;
    }
}
