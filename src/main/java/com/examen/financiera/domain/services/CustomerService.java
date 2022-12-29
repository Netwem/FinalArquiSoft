package com.examen.financiera.domain.services;

import com.examen.financiera.domain.entities.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    Customer createCustomer(Customer customer);

    List<Customer> readCustomer ();

    Optional<Customer> readCustomerId(Integer id);
}
