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
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    private String titulo;

    @Column(name = "fecha_publicacion")
    private LocalDate publishingDate;


    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name= "autor_id" )
    private Autor autor;
}
