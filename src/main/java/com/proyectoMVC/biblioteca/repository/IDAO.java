package com.proyectoMVC.biblioteca.repository;

import java.util.List;

public interface IDAO <T> {

    public T create(T t);

    public void eliminar(Long id);

    public List<T> listarTodos();

    public T buscarId(Long id);

    public T update(T t);





}
