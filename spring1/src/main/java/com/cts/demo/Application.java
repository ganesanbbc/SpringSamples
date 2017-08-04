package com.cts.demo;

import com.cts.demo.service.CustomerService;
import com.cts.demo.service.CustomerServiceImple;

public class Application {

    public static void main(String[] args) {
        CustomerService customerService = new CustomerServiceImple();
        System.out.println(customerService.findAll().get(0).getFirstName());
    }
}
