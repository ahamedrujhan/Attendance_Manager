package com.example.attendence_manager_new.customer;

import com.example.attendence_manager_new.exceptions.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {

    private final static Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    private final CustomerRepository customerRepository;


    private CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    List<Customer> getCustomers() {

        LOGGER.info("getCustomer was Called ...");
        return customerRepository.findAll();
    }

    Customer getCustomer(Long id) {
        return customerRepository.findById(id).orElseThrow(() -> {

                   NotFoundException notFoundException = new NotFoundException("Customer Not Found With id " + id);
                   LOGGER.error("Error in Getting Customer {} ", id, notFoundException);
                   return notFoundException;
        });
    }
}
