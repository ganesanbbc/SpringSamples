package com.cts.demo;

import com.cts.demo.service.CustomerService;
import com.cts.demo.service.CustomerServiceImple;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean(name = "customerConfig")
    public CustomerService getService(){
        return new CustomerServiceImple();
    }
}
