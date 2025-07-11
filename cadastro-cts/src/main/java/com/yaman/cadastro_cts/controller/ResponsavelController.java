package com.yaman.cadastro_cts.controller;

import com.yaman.cadastro_cts.model.Responsavel;
import com.yaman.cadastro_cts.service.ResponsavelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/responsaveis")
@CrossOrigin(origins = "*")
public class ResponsavelController {

    @Autowired
    private ResponsavelService responsavelService;

    @GetMapping
    public List<Responsavel> listarTodos() {
        return responsavelService.listarTodos();
    }

    @GetMapping("/{id}")
    public Responsavel buscarPorId(@PathVariable Long id) {
        return responsavelService.buscarPorId(id);
    }

    @PostMapping
    public Responsavel salvar(@RequestBody Responsavel responsavel) {
        return responsavelService.salvar(responsavel);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        responsavelService.deletar(id);
    }
}
