package com.cts.demo.service;

import com.cts.demo.model.Customer;
import com.cts.demo.dao.CustomerRespository;
import com.cts.demo.dao.HibernateCustomerRepo;

import java.util.List;

public class CustomerServiceImple implements CustomerService {


    CustomerRespository customerRespository = new HibernateCustomerRepo();


    @Override
    public List<Customer> findAll() {
        return customerRespository.findAll();
    }
}
