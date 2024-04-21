package com.example.attendence_manager_new.customer;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

public class CustomerFakeRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1,"Ahamed Rujhan"),
                new Customer(2, "Mohammed Shukry")
        );
    }
}
