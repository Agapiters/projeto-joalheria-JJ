package br.com.joalheriajoiasjoia.app.entities;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario", nullable = false)
	private Long id_usuario;

	@Column(name = "nome_usuario", nullable = false, length = 100)
	private String nomeUsuario;

<<<<<<< HEAD
	@Column(name = "cpf", nullable = false, length = 11, unique = true)
	private String cpf;
=======
    @Column(name = "nome", nullable = false, length = 100)
    private String nome_cliente;
>>>>>>> 47a9a4eb7dc67a3d9965440c52a10d9088201c1c

	@Column(name = "telefone", nullable = false)
	private String telefone;

	@Column(name = "data_nascimento")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dataNascimento;

	@Column(name = "email", nullable = false, unique = true, length = 50)
	private String email;

	@Column(name = "senha", nullable = false, unique = true, length = 50)
	private String senha;

<<<<<<< HEAD
	@ManyToOne
	@JoinColumn(name = "tipo_usuario", nullable = false)
	private TipoUsuario tipo_usuario;

	// Construtores
	public Usuario() {
	}

	public Usuario(Long id_usuario, String nomeUsuario, String cpf, String telefone, Date dataNascimento,
			String email, String senha, TipoUsuario tipo_usuario) {
		this.id_usuario = id_usuario;
		this.nomeUsuario = nomeUsuario;
		this.cpf = cpf;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.senha = senha;
		this.tipo_usuario = tipo_usuario;
	}
=======
    @Column(name = "dt_nascimento", nullable = true)
    private Date dt_Nascimento;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private TipoUsuario tipoUsuario;

    // Construtores
    public Usuario() {

    public Usuario(Long id_usuario, String nome, String cpf, String telefone, String email, String senha, Date dt_Nascimento) {
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.dt_Nascimento = dt_Nascimento;
    }
>>>>>>> 47a9a4eb7dc67a3d9965440c52a10d9088201c1c

	// Getters e Setters
	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

<<<<<<< HEAD
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public TipoUsuario getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(TipoUsuario tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}
=======
    public Date getDtNascimento() {
        return dt_Nascimento;
    }

    public void setDtNascimento(Date dt_Nascimento) {
        this.dt_Nascimento = dt_Nascimento;
    }
>>>>>>> 47a9a4eb7dc67a3d9965440c52a10d9088201c1c
}
