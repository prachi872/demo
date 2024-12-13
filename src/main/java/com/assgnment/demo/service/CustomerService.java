package com.assgnment.demo.service;

import com.assgnment.demo.entity.Customer;
import java.util.List;

public interface CustomerService {
    Customer saveCustomer(Customer customer);
    Customer getCustomerById(Integer id);
    List<Customer> getAllCustomers();
    void deleteCustomerById(Integer id);
}
