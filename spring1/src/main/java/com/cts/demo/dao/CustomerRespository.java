package com.cts.demo.dao;

import com.cts.demo.model.Customer;

import java.util.List;

public interface CustomerRespository {
    List<Customer> findAll();
}
