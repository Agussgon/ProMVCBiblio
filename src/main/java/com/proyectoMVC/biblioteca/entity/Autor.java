package com.proyectoMVC.biblioteca.entity;



import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@ToString

@Entity
@Table (name="autores")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column (name="nombre")
    private String nombre;

    @Column (name="apellido")
    private String apellido;


    @OneToMany(mappedBy ="autores")
    Set <Libro> libros= new HashSet<>();
}