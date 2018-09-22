package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
}
