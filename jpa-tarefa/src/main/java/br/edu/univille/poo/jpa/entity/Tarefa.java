package br.edu.univille.poo.jpa.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column
    private String descricao;

    @Column
    private boolean finalizada;

    @Column(nullable = false)
    private LocalDate dtPrevisao;
    
    @Column
    private LocalDate dtFinalizacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public LocalDate getDtPrevisao() {
        return dtPrevisao;
    }

    public void setDtPrevisao(LocalDate dtPrevisao) {
        this.dtPrevisao = dtPrevisao;
    }

    public LocalDate getDtFinalizacao() {
        return dtFinalizacao;
    }

    public void setDtFinalizacao(LocalDate dtFinalizacao) {
        this.dtFinalizacao = dtFinalizacao;
    }
}

