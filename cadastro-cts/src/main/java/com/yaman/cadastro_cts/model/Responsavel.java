package com.yaman.cadastro_cts.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "responsaveis")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Responsavel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
}