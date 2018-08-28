package com.codegym.cms.services;

import com.codegym.cms.models.Customer;
import com.codegym.cms.models.Province;

import java.util.List;

public interface CustomerService {
    Iterable<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Iterable<Customer> findAllByProvince(Province province);
}
