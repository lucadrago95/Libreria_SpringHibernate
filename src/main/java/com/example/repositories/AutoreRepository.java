package com.example.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exemple.model.Autore;

@Repository
public interface AutoreRepository extends JpaRepository<Autore, Long> {
    Autore save(Autore autore);
    
    Optional<Autore> findById(Long id);
    
    List<Autore> findAll();
    
    void deleteById(Long id);
    
    List<Autore> findByNome(String nome);
}