package com.proyectoMVC.biblioteca.entity;



import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import org.springframework.data.annotation.Id;

import java.util.Set;


@Getter
@Setter
@ToString

@Entity
@Table(name="autores")
public class Autor {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;

  //  @OnetoMany(mappedBy = "libros")private Set<Libro> libros =HashSet< Libro>();


}