package com.proyectoMVC.biblioteca.service;

import com.proyectoMVC.biblioteca.entity.Autor;
import com.proyectoMVC.biblioteca.repository.AutorRepository;
import com.proyectoMVC.biblioteca.repository.IDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class AutorService {


    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {

        this.autorRepository= autorRepository;
    }


/*
    private IDAO <Autor> autorDAO;



    public AutorService(){}

    @Autowired
    public AutorService(IDAO autorDAO) {
        this.autorDAO = autorDAO;
    }

    public IDAO getAutorDAO() {
        return autorDAO;
    }

    public void setAutorDAO(IDAO autorDAO) {
        this.autorDAO = autorDAO;
    }

    public Autor crear(Autor autor){
        return autorDAO.create(autor);
    }
    public void eliminar(Long id ){
       autorDAO.eliminar(id);

    };

    public Autor buscarId(Long id ){
        return autorDAO.buscarId(id);
    }

    public List<Autor> listar(){
        return  autorDAO.listarTodos();
    }


    public Autor update(Autor autor){
        return  autorDAO.update(autor);
    }*/

}
