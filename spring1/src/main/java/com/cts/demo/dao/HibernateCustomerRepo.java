package com.cts.demo.dao;

import com.cts.demo.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRespository")
public class HibernateCustomerRepo implements CustomerRespository{

    @Value("${mySqlUserName}")
    private String firstName;

    @Override
    public List<Customer> findAll() {

        List<Customer> customerList = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName("NS");
        customerList.add(customer);

        return customerList;

    }

}
