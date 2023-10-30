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

import com.example.services.AutoreService;
import com.exemple.model.Autore;

@RestController
@RequestMapping("/autori")
public class AutoreController {
    private final AutoreService autoreService;

    @Autowired
    public AutoreController(AutoreService autoreService) {
        this.autoreService = autoreService;
    }

    @PostMapping
    public Autore createAutore(@RequestBody Autore autore) {
        return autoreService.saveAutore(autore);
    }

    @GetMapping("/{id}")
    public Optional<Autore> findAutoreById(@PathVariable Long id) {
        return autoreService.findAutoreById(id);
    }

    @GetMapping
    public List<Autore> findAllAutori() {
        return autoreService.findAllAutori();
    }

    @DeleteMapping("/{id}")
    public void deleteAutoreById(@PathVariable Long id) {
        autoreService.deleteAutoreById(id);
    }
}
