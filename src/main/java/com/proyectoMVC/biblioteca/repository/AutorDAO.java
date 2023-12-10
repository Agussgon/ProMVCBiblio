package com.proyectoMVC.biblioteca.repository;

import com.proyectoMVC.biblioteca.entity.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AutorDAO implements IDAO<Autor> {

    private List<Autor> autores;
    @Autowired
    public AutorDAO() {
        this.autores = new ArrayList<>();
        autores.add(new Autor(1L,"Ray", "Bradbury"));
        autores.add(new Autor(2L,"El jugador", "Dostoviesky"));
    }
    @Override
    public Autor create(Autor autor) {
        autores.add(autor);
        return autor;
    }

    @Override
    public void eliminar(Long id) {
        for (Autor autor : autores
             ) {
            if(autor.getId().equals(id))
            { autores.remove(autor);
            }
        }
    }

    @Override
    public List<Autor> listarTodos() {
        return autores;
    }

    @Override
    public Autor buscarId(Long id) {

        Autor aut= null;
        for (Autor autor : autores
        ) {
            if(autor.getId().equals(id))
            { aut= autor;
            }
        }
     return aut;
    }


    @Override
    public Autor update(Autor autor) {
        Autor aut= null;
        for (Autor auto : autores
        ) {
            if(auto.equals(autor))
            {   auto.setNombre(autor.getNombre());
                auto.setApellido(autor.getApellido());
                //auto= autor;
                aut=auto;

            }
        }
        return aut;
    }
}
