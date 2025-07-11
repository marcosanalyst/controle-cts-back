package com.yaman.cadastro_cts.service;

import com.yaman.cadastro_cts.model.Teste;
import com.yaman.cadastro_cts.repository.TesteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TesteService {

    @Autowired
    private TesteRepository testeRepository;

    public List<Teste> listarTodos() {
        return testeRepository.findAll();
    }

    public Teste buscarPorId(Long id) {
        return testeRepository.findById(id).orElse(null);
    }

    public Teste salvar(Teste teste) {
        return testeRepository.save(teste);
    }

    public void deletar(Long id) {
        testeRepository.deleteById(id);
    }
}
