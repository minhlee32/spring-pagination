package com.codegym.cms.repositories;

import com.codegym.cms.models.Customer;

import java.util.List;

public interface Repository<T> {
    List<T> findAll();

    T findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}
