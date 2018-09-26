package com.pluralsight.repository;

import com.pluralsight.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements ICustomerRepository {

    @Value("${dbUsername}")
    private String dbUsername;

    public String getDbUsername() {
        return dbUsername;
    }

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

    @Override
    public List<Customer> findAll(){
        System.out.println(dbUsername);
        List<Customer> customers =new ArrayList<>();

        Customer customer1=new Customer("Martin","Kranec");
        Customer customer2=new Customer("Samuel", "Kranec");

        customers.add(customer1);
        customers.add(customer2);
        return customers;
    }
}
