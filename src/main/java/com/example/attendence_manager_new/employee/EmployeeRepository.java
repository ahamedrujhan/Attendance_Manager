package com.example.attendence_manager_new.employee;


import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class EmployeeRepository implements EmployeeRepo {

    public List<Employee> getEmployees() {
        return Collections.emptyList();
    }
}
