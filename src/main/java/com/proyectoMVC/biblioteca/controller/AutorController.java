package com.proyectoMVC.biblioteca.controller;


import com.proyectoMVC.biblioteca.entity.Autor;
import com.proyectoMVC.biblioteca.service.AutorService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/autores")
@CrossOrigin("http://localhost:8081/*")
public class AutorController {

private final AutorService autorService;


    @Autowired
    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @GetMapping ("/todos")
    public ResponseEntity<?> traerAutores(){
       List<Autor> autores= autorService.listarAutores();
       if(autores.size() > 0){
        return  ResponseEntity.ok().body(autores); }
       else {
           return ResponseEntity.status(404).body("No encontrado");
       }

    }

    @GetMapping ("/{id}")
    public ResponseEntity<?> buscarId(@PathVariable Long id ){
        Optional<Autor> autor= autorService.buscarId(id);



        if(  autor.isPresent()){
            return ResponseEntity.status(200).body(autor);
        }
        else { //if(autor.isEmpty())
            return ResponseEntity.badRequest().body("Autor no encontrado");
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<?> crearAutor(@RequestBody Autor autor){
       Autor autorCreado= null;
        if(autor != null){
            autorCreado= autorService.crear(autor);
            return ResponseEntity.ok().body(autorCreado);
        }
        else {
            return ResponseEntity.badRequest().body("Ingrese un autor válido");
        }
    }

}
