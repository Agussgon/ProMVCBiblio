package com.proyectoMVC.biblioteca.repository;

import com.proyectoMVC.biblioteca.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro,Long> {


}
