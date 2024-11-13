package com.test.demo.services;

import com.test.demo.dto.CustomerRequestDTO;
import com.test.demo.entities.Customer;
import com.test.demo.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    public void registerCustomer(CustomerRequestDTO customerRequestDTO) {

        //1. Logging request
        //2. Save the db
        //3. log respone

        Customer customer = new Customer();
        customer.
    }

}
