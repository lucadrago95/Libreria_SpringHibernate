package com.example.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repositories.LibroRepository;
import com.exemple.model.Libro;

@Service
public class LibroService {	
	private final LibroRepository libroRepository;

    @Autowired
    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public Libro saveLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    public Optional<Libro> findLibroById(Long id) {
        return libroRepository.findById(id);
    }

    public List<Libro> findAllLibri() {
        return libroRepository.findAll();
    }

    public void deleteLibroById(Long id) {
        libroRepository.deleteById(id);
    }

}
