package br.com.fiap.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_TIPODEACAO")
public class TipoDeAcao {


    @Id
    @Column(name = "ID_TipoDeAcao")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_TipoDeAcao")
    @SequenceGenerator(name = "SQ_TipoDeAcao", sequenceName = "SQ_TipoDeAcao")
    private Long id;

    @Column(name = "NM_TipoDeAcao")
    private String nome;

    public TipoDeAcao() {
    }

    public TipoDeAcao(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }


    public Long getId() {
        return id;
    }

    public TipoDeAcao setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public TipoDeAcao setNome(String nome) {
        this.nome = nome;
        return this;
    }


    @Override
    public String toString() {
        return "TipoDeAcao{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}