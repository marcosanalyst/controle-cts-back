package com.yaman.cadastro_cts.repository;

import com.yaman.cadastro_cts.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}