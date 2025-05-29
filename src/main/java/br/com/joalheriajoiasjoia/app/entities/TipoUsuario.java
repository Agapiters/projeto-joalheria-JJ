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

<<<<<<< HEAD
    @OneToMany
    @JsonManagedReference
    private List<Usuario> usuarios;
=======
    
    @OneToMany(mappedBy = "tipoUsuario")
    @JsonManagedReference
    private List<Usuario> usuario;
>>>>>>> 8fc1f56af18e6d674e47e22a6715d23bf7d46564

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
<<<<<<< HEAD
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
=======
        return usuario;
    }

    public void setUsuarios(List<Usuario> usuario) {
        this.usuario = usuario;
    }
}
>>>>>>> 8fc1f56af18e6d674e47e22a6715d23bf7d46564
