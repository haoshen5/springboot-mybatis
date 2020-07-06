package com.atguigu.service;

import com.atguigu.domain.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findCustomers();
    Customer findCustomerById(Integer id);
    void saveCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomerById(Integer id);

}
