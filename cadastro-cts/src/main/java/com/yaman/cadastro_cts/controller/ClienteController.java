package com.yaman.cadastro_cts.controller;

import com.yaman.cadastro_cts.model.Cliente;
import com.yaman.cadastro_cts.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin(origins = "*")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> listarTodos() {
        return clienteService.findAll();
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Long id) {
        return clienteService.findById(id);
    }

    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        clienteService.delete(id);
    }
}
