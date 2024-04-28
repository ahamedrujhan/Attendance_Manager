package com.example.attendence_manager_new.employee;

import jakarta.validation.constraints.NotBlank;

public class Employee {
    private final long employeeId;
    @NotBlank(message = "Employee name must not be empty")
    private final String employeeName;
    private final long ComplanyId;

    public Employee(long employeeId, String employeeName, long complanyId) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.ComplanyId = complanyId;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public long getComplanyId() {
        return ComplanyId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", ComplanyId=" + ComplanyId +
                '}';
    }
}
