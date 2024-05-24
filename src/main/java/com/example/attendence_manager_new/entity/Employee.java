package com.example.attendence_manager_new.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity(name = "Employee")
@Table(
        name = "employee",
        uniqueConstraints = {
                @UniqueConstraint(name = "employee_email_unique",columnNames = {"email"})
        }
)
public class Employee {

    @Id
    @SequenceGenerator(
            name = "emp_id",
            sequenceName = "emp_id",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "emp_id"

    )
    @Column(name = "employee_id",
    updatable = false
    )
    private Long id;
    @Column(name = "first_name",
    nullable = false,
            columnDefinition = "TEXT"
    )
    private String firstName;

    @Column(name = "last_name",
    nullable = false,
            columnDefinition = "TEXT"
    )
    private String lastName;

    @Column(name = "date_of_birth",
    nullable = false)
    private LocalDate dateOfBirth;

    @Column(name = "email",
    nullable = false,
    columnDefinition = "TEXT")
    private String email;
    @Column(name = "status",
    nullable = false)
    private Integer status;

    //Bidirectional mapping to employee with semployee id card
    @OneToOne(mappedBy = "employee")
    private EmployeeIdCard employeeIdCard;

    public Employee(String firstName, String lastName, LocalDate dateOfBirth, String email, Integer status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.status = status;
    }

    public Employee() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", email='" + email + '\'' +
                ", status=" + status +
                '}';
    }
}
