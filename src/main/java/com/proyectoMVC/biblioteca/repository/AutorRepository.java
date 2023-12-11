package com.proyectoMVC.biblioteca.repository;


import com.proyectoMVC.biblioteca.entity.Autor;
import com.proyectoMVC.biblioteca.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AutorRepository extends JpaRepository<Autor,Long> {

}
