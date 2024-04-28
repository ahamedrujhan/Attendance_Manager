package com.example.attendence_manager_new.employee;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo {

    List<Employee> getEmployees();
}
