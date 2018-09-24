package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    //@Autowired
    private ICustomerRepository customerRepository;

    public ICustomerRepository getCustomerRepository() {
        return customerRepository;
    }

    //@Autowired
    public void setCustomerRepository(ICustomerRepository customerRepository) {
        System.out.println("We are using setter");
        this.customerRepository = customerRepository;
    }

    public CustomerServiceImpl() {
    }

    @Autowired
    public CustomerServiceImpl(ICustomerRepository customerRepository) {
        System.out.println("We r using constructor injection");
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll(){
        return  customerRepository.findAll();
    }
}
