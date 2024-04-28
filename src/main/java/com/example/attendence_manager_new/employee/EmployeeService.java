package com.example.attendence_manager_new.employee;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    public EmployeeService (EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    List<Employee> getEmployees() {
        return employeeRepo.getEmployees();
    }

    Employee getEmployee(Long id) {
        return employeeRepo.getEmployees().stream().filter(employee -> employee.getEmployeeId() == id).findFirst().orElseThrow(() -> new IllegalStateException("Empoloyee Not Found With this id "+ id));
    }
}
