package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.repository.ICustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private ICustomerRepository customerRepository =new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll(){
        return  customerRepository.findAll();
    }

}
