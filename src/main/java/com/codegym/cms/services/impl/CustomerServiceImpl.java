package com.codegym.cms.services.impl;

import com.codegym.cms.models.Customer;
import com.codegym.cms.repositories.CustomerRepository;
import com.codegym.cms.repositories.impl.CustomerRepositoryImpl;
import com.codegym.cms.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.remove(id);
    }
}
