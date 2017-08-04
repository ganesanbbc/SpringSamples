package com.cts.demo.dao;

import com.cts.demo.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepo implements CustomerRespository{

    @Override
    public List<Customer> findAll() {

        List<Customer> customerList = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstName("Ganesh");
        customer.setLastName("NS");
        customerList.add(customer);

        return customerList;

    }

}
