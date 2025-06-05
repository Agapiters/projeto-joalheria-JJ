package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_ornamentos")
public class Ornamentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idOrnamentos", nullable = false)
    private Long idOrnamentos;

    @Column(name = "nomeOrnamento", nullable = false, length = 100)
    private String nomeOrnamento;

    @Column(name = "descricaoOrnamento", length = 255)
    private String descricaoOrnamento;

    public Ornamentos() {
    }

    public Ornamentos(Long idOrnamentos, String nomeOrnamento, String descricaoOrnamento) {
        this.idOrnamentos = idOrnamentos;
        this.nomeOrnamento = nomeOrnamento;
        this.descricaoOrnamento = descricaoOrnamento;
    }

    public Long getIdOrnamentos() {
        return idOrnamentos;
    }

    public void setIdOrnamentos(Long idOrnamentos) {
        this.idOrnamentos = idOrnamentos;
    }

    public String getNomeOrnamento() {
        return nomeOrnamento;
    }

    public void setNomeOrnamento(String nomeOrnamento) {
        this.nomeOrnamento = nomeOrnamento;
    }

    public String getDescricaoOrnamento() {
        return descricaoOrnamento;
    }

    public void setDescricaoOrnamento(String descricaoOrnamento) {
        this.descricaoOrnamento = descricaoOrnamento;
    }
}
