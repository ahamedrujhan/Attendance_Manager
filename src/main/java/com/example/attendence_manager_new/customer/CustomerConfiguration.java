package com.example.attendence_manager_new.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {
    @Value("${app.useCustomerFakeRepo:false}")
    private Boolean useCustomerFakeRepo;

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println("Command Line runner...");
        };
    }

    @Bean
    CustomerRepo customerRepo () {
        System.out.println("UseCustomerFakeRepo = " + useCustomerFakeRepo);
        return useCustomerFakeRepo ?
                new CustomerFakeRepository() : new CustomerRepository();
    }
}
