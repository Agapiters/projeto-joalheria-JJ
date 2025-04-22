package br.com.joalheriajoiasjoia.app.entities;

import java.time.LocalDate;

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
	@Column(name = "idUsuario", nullable = false)
	private Long idUsuario;

	@Column(name = "nomeUsuario", nullable = false, length = 100)
	private String nomeUsuario;

	@Column(name = "cpf", nullable = false, length = 11, unique = true)
	private String cpf;

	@Column(name = "telefone", nullable = false)
	private String telefone;

	@Column(name = "dtNascimento")
	private LocalDate dtNascimento;

	@Column(name = "email", nullable = false, unique = true, length = 50)
	private String email;

	@ManyToOne
	@JoinColumn(name = "tipoUsuario", nullable = false)
	private TipoUsuario tipoUsuario;

public Usuario() {
}

public Usuario(Long idUsuario, String nomeUsuario, String cpf, String telefone,
            LocalDate dtNascimento, String email, TipoUsuario tipoUsuario) {
 this.idUsuario = idUsuario;
 this.nomeUsuario = nomeUsuario;
 this.cpf = cpf;
 this.telefone = telefone;
 this.dtNascimento = dtNascimento;
 this.email = email;
 this.tipoUsuario = tipoUsuario;
}

//Getters e Setters
public Long getIdUsuario() {
 return idUsuario;
}

public void setId_usuario(Long id_usuario) {
 this.idUsuario = id_usuario;
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

public LocalDate getDtNascimento() {
 return dtNascimento;
}

public void setDtNascimento(LocalDate dtNascimento) {
 this.dtNascimento = dtNascimento;
}

public String getEmail() {
 return email;
}

public void setEmail(String email) {
 this.email = email;
}


public TipoUsuario getTipoUsuario() {
 return tipoUsuario;
}

public void setTipoUsuario(TipoUsuario tipoUsuario) {
 this.tipoUsuario = tipoUsuario;
}

}


	