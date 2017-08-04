package com.cts.demo.service;

import com.cts.demo.dao.CustomerRespository;
import com.cts.demo.model.Customer;

import java.util.List;

public class CustomerServiceImple implements CustomerService {


    CustomerRespository customerRespository;

    public void setCustomerRespository(CustomerRespository customerRespository) {
        this.customerRespository = customerRespository;
    }


    public CustomerServiceImple() {
    }

    public CustomerServiceImple(CustomerRespository customerRespository) {
        this.customerRespository = customerRespository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRespository.findAll();
    }
}
