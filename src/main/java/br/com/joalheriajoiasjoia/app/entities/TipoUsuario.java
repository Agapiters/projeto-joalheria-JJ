package br.com.joalheriajoiasjoia.app.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_tipo_usuario")
public class TipoUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_usuario", nullable = false)
    private long idTipoUsuario;

    @Column(name = "nome_tipo_usuario", nullable = false)
    private String nomeTipoUsuario;

    @OneToMany
    @JsonManagedReference
    private List<Usuario> usuarios;

    public TipoUsuario() {}

    public TipoUsuario(long idTipoUsuario, String nomeTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
        this.nomeTipoUsuario = nomeTipoUsuario;
    }

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

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
