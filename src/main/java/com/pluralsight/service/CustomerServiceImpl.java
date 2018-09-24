package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.ICustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private ICustomerRepository customerRepository;

    public CustomerServiceImpl() {
    }

    public CustomerServiceImpl(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll(){
        return  customerRepository.findAll();
    }

    public ICustomerRepository getCustomerRepository() {
        return customerRepository;
    }

    public void setCustomerRepository(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
