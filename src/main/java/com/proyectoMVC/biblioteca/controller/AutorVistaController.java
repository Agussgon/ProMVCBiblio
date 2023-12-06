package com.proyectoMVC.biblioteca.controller;


import com.proyectoMVC.biblioteca.entity.Autor;
import com.proyectoMVC.biblioteca.service.AutorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;



// dejarlo como ejemplo para diferenciar restcontroller
@Controller
public class AutorVistaController {

    private AutorService autorService;

    public AutorVistaController(AutorService autorService) {
        this.autorService = autorService;
    }
    //plantilla index
    @GetMapping("/") // por defecto levanta el html index
    public String index(Model model){
        model.addAttribute("saludo","Bienvenidos a la vista");
        List<Autor> autores= autorService.listar();
        model.addAttribute("autores",autores);
        return "index";

    }

    //plantilla listar
    @GetMapping("/listarVista")
    public String listarAutores(Model model){
       List<Autor> autores= autorService.listar();
       model.addAttribute("nombres",autores);
       return "listar";

   }


}
