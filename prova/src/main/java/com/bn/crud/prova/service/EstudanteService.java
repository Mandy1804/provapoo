package com.bn.crud.prova.service;

import com.bn.crud.prova.model.Estudante;
import com.bn.crud.prova.repository.EstudanteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudanteService {

    @Autowired
    public EstudanteRepository repository;

    public Estudante salvar(Estudante estudante) {
        return repository.save(estudante);
    }

    public List<Estudante> listarTodos() {
        return repository.findAll();
    }

    public Optional<Estudante> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletarPorId(Long id) {
        repository.deleteById(id);
    }
}
