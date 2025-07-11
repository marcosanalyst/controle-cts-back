package com.yaman.cadastro_cts.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "testes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "responsavel_id")
    private Responsavel responsavel;

    @Column(nullable = false)
    private String estado;

    private String impedimento;

    private LocalDateTime dataCriacao;

    private LocalDateTime dataFinalizacao;
}