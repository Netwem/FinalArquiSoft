package com.examen.financiera.domain.repositories;

import com.examen.financiera.domain.entities.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository {

    Customer createCustomer(Customer customer);

    List<Customer> readCustomer();

    Optional <Customer> readCustomerId (Integer id);
}
