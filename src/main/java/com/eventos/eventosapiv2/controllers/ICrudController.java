package com.eventos.eventosapiv2.controllers;

import java.util.List;

public interface ICrudController<T> {
    List<T> getAll();
    T getById(Long id);
    void create(T entity);
    void update(Long id, T entity);
    void delete(Long id);
}

