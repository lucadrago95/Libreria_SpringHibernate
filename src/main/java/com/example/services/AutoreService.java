package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repositories.AutoreRepository;
import com.exemple.model.Autore;

@Service
public class AutoreService {
    private final AutoreRepository autoreRepository;

    @Autowired
    public AutoreService(AutoreRepository autoreRepository) {
        this.autoreRepository = autoreRepository;
    }

    public Autore saveAutore(Autore autore) {
        return autoreRepository.save(autore);
    }

    public Optional<Autore> findAutoreById(Long id) {
        return autoreRepository.findById(id);
    }

    public List<Autore> findAllAutori() {
        return autoreRepository.findAll();
    }

    public void deleteAutoreById(Long id) {
        autoreRepository.deleteById(id);
    }
}