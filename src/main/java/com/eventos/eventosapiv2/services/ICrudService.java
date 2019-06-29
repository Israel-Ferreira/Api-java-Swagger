package com.eventos.eventosapiv2.services;
import java.util.List;

public interface ICrudService<T> {
    List<T> getAll();
    T getById(Long id);
    void create(T entity);
    void update(Long id,T entity);
    void delete(Long id);
}
