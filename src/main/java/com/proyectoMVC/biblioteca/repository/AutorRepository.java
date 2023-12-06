package com.proyectoMVC.biblioteca.repository;

import com.proyectoMVC.biblioteca.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Libro,Long> {

}
