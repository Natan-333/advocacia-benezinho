package br.com.fiap.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_AREA", uniqueConstraints ={

        @UniqueConstraint(name = "UK_NM_AREA", columnNames = {"NM_AREA"} )
} )
public class Advogado {

    @Id
    @SequenceGenerator(name = "SQ_AREA", sequenceName = "SQ_AREA", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_DEPOSITO")
    @Column(name = "ID_DEPOSITO")

    private Long id;

    private String nome;

    private String numeroOAB;

    private Estado estado;

    public Advogado() {
    }


    public Advogado(Long id, String nome, String numeroOAB, Estado estado) {
        this.id = id;
        this.nome = nome;
        this.numeroOAB = numeroOAB;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public Advogado setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Advogado setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getNumeroOAB() {
        return numeroOAB;
    }

    public Advogado setNumeroOAB(String numeroOAB) {
        this.numeroOAB = numeroOAB;
        return this;
    }

    public Estado getEstado() {
        return estado;
    }

    public Advogado setEstado(Estado estado) {
        this.estado = estado;
        return this;
    }

    @Override
    public String toString() {
        return "Advogado{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", numeroOAB='" + numeroOAB + '\'' +
                '}';
    }


}
