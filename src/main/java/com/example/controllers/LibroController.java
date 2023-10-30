package com.example.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.services.LibroService;
import com.exemple.model.Libro;

@RestController
@RequestMapping("/libri")
public class LibroController {
    private final LibroService libroService;

    @Autowired
    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    @PostMapping
    public Libro createLibro(@RequestBody Libro libro) {
        return libroService.saveLibro(libro);
    }
    
    @GetMapping("/{id}")
    public Optional<Libro> findLibroById(@PathVariable Long id) {
        return libroService.findLibroById(id);
    }
    
    @GetMapping
    public List<Libro> findAllLibri() {
        return libroService.findAllLibri();
    }

    @DeleteMapping("/{id}")
    public void deleteLibroById(@PathVariable Long id) {
        libroService.deleteLibroById(id);
    }
}