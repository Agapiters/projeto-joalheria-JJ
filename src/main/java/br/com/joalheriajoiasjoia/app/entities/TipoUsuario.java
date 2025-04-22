package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_tipo_usuario")
public class TipoUsuario {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_usuario", nullable = false)
    private long idTipoUsuario;

    @Column(name = "nome_tipo_usuario", nullable = false)
    private String nomeTipoUsuario;

    // Construtores
    public TipoUsuario() {
    }

    public TipoUsuario(long idTipoUsuario, String nomeTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
        this.nomeTipoUsuario = nomeTipoUsuario;
    }

    // Getters e Setters
    public long getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(long idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getNomeTipoUsuario() {
        return nomeTipoUsuario;
    }

    public void setNomeTipoUsuario(String nomeTipoUsuario) {
        this.nomeTipoUsuario = nomeTipoUsuario;
    }
}
