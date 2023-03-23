package com.example.demo.service;

import java.util.List;

public interface ModelService<E> {
    List<E> findAll();

    E findById(Integer id);

    E save(E e);

    E update(E e);

    boolean delete(Integer id);

}
