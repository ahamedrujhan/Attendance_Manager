package com.example.attendence_manager_new.customer;

import java.util.Arrays;
import java.util.List;

public class CustomerFakeRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1,"Ahamed Rujhan", "password123", "email@gmail.com"),
                new Customer(2, "Mohammed Shukry", "123password", "email@gmail.com")
        );
    }
}
