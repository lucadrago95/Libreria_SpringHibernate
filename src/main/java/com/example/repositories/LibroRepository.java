package com.example.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exemple.model.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long>{
    
    Libro save(Libro libro);
    
    Optional<Libro> findById(Long id);
    
    List<Libro> findAll();
    
    void deleteById(Long id);
}
