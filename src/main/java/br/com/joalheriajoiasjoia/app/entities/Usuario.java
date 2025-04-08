package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false)
    private Long id_usuario;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "cpf", nullable = false, length = 11, unique = true)
    private String cpf;

    @Column(name = "telefone", nullable = false, length = 15)
    private String telefone;

    @Column(name = "email", nullable = false, unique = true, length = 50)
    private String email;

    @Column(name = "senha", nullable = false, length = 100)
    private String senha;

    @Column(name = "dt_nascimento", nullable = true)
    private Date dt_Nascimento;
   
    @ManyToOne
    @JoinColumn(name = "tipo_usuario")
    private TipoUsuario tipousuario;

    // Construtores
    public Usuario() {}

    public Usuario(Long id_usuario, String nome, String cpf, String telefone, String email, String senha, Date dt_Nascimento) {
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.dt_Nascimento = dt_Nascimento;
    }

    // Getters e Setters
    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDt_Nascimento() {
        return dt_Nascimento;
    }

    public void setDt_Nascimento(Date dt_Nascimento) {
        this.dt_Nascimento = dt_Nascimento;
    }
}