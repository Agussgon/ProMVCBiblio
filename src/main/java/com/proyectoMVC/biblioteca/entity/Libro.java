package com.proyectoMVC.biblioteca.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString

@Entity
@Table(name="libros")
public class Libro {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name="id")
    private Long id;


    private String titulo;

  //  @ManytoOne(fetch = FetchType.LAZY)
  //  private Autor autor;


    @Column(name = "fecha_publicacion")
    private LocalDate publishingDate;

}
