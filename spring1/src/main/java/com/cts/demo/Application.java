package com.cts.demo;

import com.cts.demo.controller.CustomerController;
import com.cts.demo.service.CustomerService;
import com.cts.demo.service.CustomerServiceImple;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        CustomerController customerController = context.getBean("customController", CustomerController.class);
//
        customerController.getCustomer();

//        CustomerService customerService = context.getBean("customerService", CustomerService.class);
//
//        System.out.println(customerService.findAll().get(0).getFirstName());
    }
}
