package com.yaman.cadastro_cts.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "clientes")

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
    
    private LocalDateTime dataCriacao;
    
 // construtores
    public Cliente() {}
    public Cliente(Long id, String nome, LocalDateTime dataCriacao) {
        this.id = id;
        this.nome = nome;
        this.dataCriacao = dataCriacao;
    }

    // getters / setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public LocalDateTime getDataCriacao() { return dataCriacao; }
    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
    

