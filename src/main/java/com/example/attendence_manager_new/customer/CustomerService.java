package com.example.attendence_manager_new.customer;

import com.example.attendence_manager_new.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {

    private final CustomerRepo customerRepo;

    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    List<Customer> getCustomers() {
        return customerRepo.getCustomers();
    }

    Customer getCustomer(Long id) {
        return customerRepo.getCustomers().stream().filter(customer -> customer.getId() == id).findFirst().orElseThrow(() -> new NotFoundException("Customer Not Found With id " + id));
    }
}
