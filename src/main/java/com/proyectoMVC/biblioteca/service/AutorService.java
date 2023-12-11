package com.proyectoMVC.biblioteca.service;


import com.proyectoMVC.biblioteca.entity.Autor;
import com.proyectoMVC.biblioteca.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

private final AutorRepository autorRepository;


    @Autowired
    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public Optional<Autor> buscarId (Long id){

        return autorRepository.findById(id);
    }

    public List<Autor> listarAutores(){
        return autorRepository.findAll();
    }

    public void eliminar(Long id){

         autorRepository.deleteById(id);
    }

    public Autor crear(Autor autor){

        return  autorRepository.save(autor);
    }

    public Autor modificar(Autor autor){

        return autorRepository.save(autor);
    }

}
