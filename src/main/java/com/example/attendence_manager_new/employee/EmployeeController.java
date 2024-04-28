package com.example.attendence_manager_new.employee;


import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RequestMapping("api/v1/employee")
@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController (EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //Create New Employee
    @PostMapping
    void createNewEmployee(@Valid @RequestBody Employee employee) {
        System.out.println("New employee creation with post request..");
        System.out.println(employee);
    }

    //Get Specific Employee Detail
    @GetMapping(path = "{employeeId}")
    Employee getEmployeeDetail(@PathVariable("employeeId") Long id) {
        System.out.println("Get Method... Employee Details By id");
        return employeeService.getEmployee(id);
    }

    //Get All Employee Details
    @GetMapping (value = "all")
    List<Employee> getAllEmployee() {
        System.out.println("Get Method... All Employee Details");
        return Collections.singletonList(
                new Employee(1,"Ruju", 1)
        );
    }

    //Delete Specific Employee
    @DeleteMapping(path = "{employeeId}")
    void deleteEmployee(@PathVariable("employeeId") Long id) {
        System.out.println("Delete Request...");
    }

    //Update Employee
    @PutMapping
    void updateEmployee(@RequestBody Employee employee) {
        System.out.println("Update Request...");
        System.out.println(employee);
    }
}
