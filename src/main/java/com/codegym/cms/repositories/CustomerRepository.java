package com.codegym.cms.repositories;

import com.codegym.cms.models.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {
}
