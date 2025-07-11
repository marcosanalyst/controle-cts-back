package com.yaman.cadastro_cts.service;

import com.yaman.cadastro_cts.model.Cliente;
import com.yaman.cadastro_cts.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Cliente findById(Long id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado com ID: " + id));
    }

    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente update(Long id, Cliente clienteAtualizado) {
        Cliente clienteExistente = findById(id);

        clienteExistente.setNome(clienteAtualizado.getNome());

        return clienteRepository.save(clienteExistente);
    }

    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }
}
