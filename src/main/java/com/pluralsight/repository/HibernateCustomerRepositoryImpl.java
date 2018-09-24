package com.pluralsight.repository;

import com.pluralsight.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements ICustomerRepository {
    @Override
    public List<Customer> findAll(){
        List<Customer> customers =new ArrayList<>();

        Customer customer1=new Customer("Martin","Kranec");
        Customer customer2=new Customer("Samuel", "Kranec");

        customers.add(customer1);
        customers.add(customer2);
        return customers;
    }
}
