package com.codegym.cms.repositories;

import com.codegym.cms.models.Customer;
import com.codegym.cms.models.Province;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);
}
