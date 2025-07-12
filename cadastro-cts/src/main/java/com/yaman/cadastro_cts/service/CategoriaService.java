package com.yaman.cadastro_cts.service;

import com.yaman.cadastro_cts.model.Categoria;
import com.yaman.cadastro_cts.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> listarTodas() {
        return categoriaRepository.findAll();
    }

    public Categoria buscarPorId(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    public Categoria salvar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public void deletar(Long id) {
        categoriaRepository.deleteById(id);
    }
    public Categoria update(Long id, Categoria categoriaAtualizada) {
        Categoria existente = buscarPorId(id);
        existente.setNome(categoriaAtualizada.getNome());
        return categoriaRepository.save(existente);
    }
}
