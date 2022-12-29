package com.examen.financiera.domain.services;

import com.examen.financiera.domain.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerServiceImpl customerRepository;

    @Override
    public Customer createCustomer(Customer customer) {
        return null;
    }

    @Override
    public List<Customer> readCustomer() {
        return customerRepository.readCustomer();
    }

    @Override
    public Optional<Customer> readCustomerId(Integer id) {
        return customerRepository.readCustomerId(id);
    }
}
