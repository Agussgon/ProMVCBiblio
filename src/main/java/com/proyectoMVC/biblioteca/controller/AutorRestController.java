package com.proyectoMVC.biblioteca.controller;

import com.proyectoMVC.biblioteca.entity.Autor;
import com.proyectoMVC.biblioteca.service.AutorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // inlcuye response body
@RequestMapping("/autores")
public class AutorRestController {


   private AutorService autorService;

    public AutorRestController(AutorService autorService) {
        this.autorService = autorService;
    }


    // retorna un json no una vista
    @GetMapping
    public List<Autor> listarAutores(){
        System.out.println(autorService.listar());
        return autorService.listar();
    }


    // dos formas de usar @PathVariable
    @GetMapping("/{nombre}/{apellido}")
    public String saludo(@PathVariable String nombre, @PathVariable String apellido){
        return "Inicio del sitio "+ nombre + " "+ apellido;

    }
    @GetMapping("/{autorId}") // response entity
    public ResponseEntity<?> traerAutor(@PathVariable Long autorId) {
        Autor autor= autorService.buscarId(autorId);
        // lo tenemos definido en una variable estática

        if (autor == null) {
            return ResponseEntity.badRequest().body("Autor no encontrado");
        }
        else{
        return ResponseEntity.status(200).body(autor);
        }
               // ResponseEntity.ok().body(autorEncontrado);
    }


    // recibe parametros http://localhost:8080/autor?nombre=%22Silvina%22&apellido=%22Ocampo%22
    @GetMapping("/parametros") // los datos son visibles en la url
    public ResponseEntity<?> crearAutorParametros
    (@RequestParam String nombre, @RequestParam String apellido)
    { if (nombre.equals("") || apellido.equals("") ){
        return ResponseEntity.status(400).body("Ingrese valores válidos");
    } else{
        return ResponseEntity.ok().body(autorService.crear(new Autor(3L,nombre,apellido)));
    }
    }


    /*  Postman */
    @PostMapping( "/crear")
    public Autor crearAutor(@RequestBody Autor autor) {

        return autorService.crear(autor);
    }


}
