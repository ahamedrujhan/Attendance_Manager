package com.example.attendence_manager_new;

import com.example.attendence_manager_new.entity.Employee;
import com.example.attendence_manager_new.entity.EmployeeIdCard;
import com.example.attendence_manager_new.repository.EmployeeIdCardRepository;
import com.example.attendence_manager_new.repository.EmployeeRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class AttendenceManagerNewApplication {

    public static void main(String[] args) {
        SpringApplication.run(AttendenceManagerNewApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner (EmployeeRepository employeeRepository, EmployeeIdCardRepository employeeIdCardRepository) {
       return args -> {
           Faker faker = new Faker();

           String firstName = faker.name().firstName();
           String lastName = faker.name().lastName();
           LocalDate bod = LocalDate.now().minusYears(1).minusMonths(1);
           String email = String.format("%s.%s@gmail.com", firstName,lastName);
           Integer status = 1;

           Employee employee = new Employee(firstName,lastName,bod,email,status);
           EmployeeIdCard employeeIdCard = new EmployeeIdCard("123456789", employee);
           employeeIdCardRepository.save(employeeIdCard);


           employeeRepository.findById(1L).ifPresent(System.out::println);
           employeeIdCardRepository.findById(1L).ifPresent(System.out::println);

       };


       }

    private void paginationAndSorting(EmployeeRepository employeeRepository) {
        //Page Request With size of 5 and first page with sorting
        //0 - first page
        PageRequest pageRequest = PageRequest.of(0,5, Sort.by("firstName").ascending());
        Page<Employee> pageSorted = employeeRepository.findAll(pageRequest);
        System.out.println(pageSorted);
    }

    //Sorting Method
    private void sortingResults(EmployeeRepository employeeRepository) {
        Sort sortingByFirstName = Sort.by(Sort.Direction.DESC, "firstName");
        Sort sortByFirstNameAndEmail = Sort.by("firstName").ascending().and(Sort.by("email").descending());
        employeeRepository.findAll(sortByFirstNameAndEmail).forEach(employee -> {
            System.out.println(employee.getFirstName() +" --- " + employee.getEmail());
        });
    }

    //Genarate Random Studends Method
    private void genarateRandomStudents(EmployeeRepository employeeRepository, int count) {
        Faker faker = new Faker();
        for(int i = 0; i<count; i++) {
            String firstName = faker.name().firstName();
            String lastName = faker.name().lastName();
            LocalDate bod = LocalDate.now().minusYears(i).minusMonths(i-1);
            String email = String.format("%s.%s@gmail.com", firstName,lastName);
            Integer status = 1;
            // Employee Object
            Employee employee = new Employee(firstName,lastName,bod,email,status);
            employeeRepository.save(employee);
        }
    }

    ;

    }


