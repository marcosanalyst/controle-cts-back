package com.yaman.cadastro_cts.controller;

import com.yaman.cadastro_cts.model.Teste;
import com.yaman.cadastro_cts.service.TesteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/testes")
@CrossOrigin(origins = "*")
public class TesteController {

    @Autowired
    private TesteService testeService;

    @GetMapping
    public List<Teste> listarTodos() {
        return testeService.listarTodos();
    }

    @GetMapping("/{id}")
    public Teste buscarPorId(@PathVariable Long id) {
        return testeService.buscarPorId(id);
    }

    @PostMapping
    public Teste salvar(@RequestBody Teste teste) {
        return testeService.salvar(teste);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        testeService.deletar(id);
    }
}
