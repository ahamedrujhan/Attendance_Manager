package com.example.attendence_manager_new.customer;

import com.example.attendence_manager_new.exceptions.ApiRequestException;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RequestMapping(path = "api/v2/customer")
@RestController
public class CustomerControllerV2 {

    private final CustomerService customerService;

//    @Autowired
    public CustomerControllerV2(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(path = "{customerId}")
    Customer getCustomer(@PathVariable("customerId") Long id) {
       return customerService.getCustomer(id);

    }

    @GetMapping(path = "{customerId}/exception")
    Customer getCustomerException(@PathVariable("customerId") Long id) {
        throw new ApiRequestException("ApiRequestExeception Not Found for id " + id );

    }

    @GetMapping(value = "all")
    List<Customer> getCustomers() {
        return Collections.singletonList(
                new Customer(1, "Ruju", "123", "email@gmail.com")
        );
    }

    @PostMapping
    void createNewCutomer(@Valid @RequestBody Customer customer) {
        System.out.println("POST REQUEST....");
        System.out.println(customer);
    }

    @PutMapping
    void updateCustomer(@RequestBody Customer customer) {
        System.out.println("UPDATE Request...");
        System.out.println(customer);
    }

    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id) {
        System.out.println("Delete Request for Customer Id " + id);
    }

}
