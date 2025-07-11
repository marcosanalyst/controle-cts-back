package com.yaman.cadastro_cts.repository;

import com.yaman.cadastro_cts.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
