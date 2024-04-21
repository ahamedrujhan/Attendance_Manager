package com.example.attendence_manager_new.customer;

import java.util.Collections;
import java.util.List;


public class CustomerRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        //To do connect with real DB
        return Collections.emptyList();
    }
}
