package com.cts.demo.service;

import com.cts.demo.dao.CustomerRespository;
import com.cts.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImple implements CustomerService {


    @Autowired
    CustomerRespository customerRespository;


//    public void setCustomerRespository(CustomerRespository customerRespository) {
//        this.customerRespository = customerRespository;
//    }


    public CustomerServiceImple() {
    }

//    public CustomerServiceImple(CustomerRespository customerRespository) {
//        this.customerRespository = customerRespository;
//    }

    @Override
    public List<Customer> findAll() {
        return customerRespository.findAll();
    }
}
