package com.example.attendence_manager_new;

import com.example.attendence_manager_new.entity.Employee;
import com.example.attendence_manager_new.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class AttendenceManagerNewApplication {

    public static void main(String[] args) {
        SpringApplication.run(AttendenceManagerNewApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner (EmployeeRepository employeeRepository) {
       return args -> {
           Employee ruju = new Employee("Ahamed", "Rujhan", new Date(2001,01,05),"ruju@gmail.com",1);
           Employee zahran = new Employee("Ahamed", "Zahran", new Date(2006,05,12), "zah@gmail.com", 1);
           employeeRepository.saveAll(List.of(ruju,zahran));

//           employeeRepository.findEmployeeByEmail("zah@gmail.com").ifPresentOrElse(System.out::println, ()->{
//               System.out.println("Student With zah@gmail.com not Found");
//           });

//           employeeRepository.findEmployeeByFirstNameEqualsAndStatusEquals("Ahamed",1).forEach(System.out::println);
           System.out.println("Find All Employees first Name Ahamed");
           employeeRepository.findEmployeeByFirstName("Ahamed").forEach(System.out::println);

           System.out.println("All Employees");
           employeeRepository.listAllEmployees().forEach(System.out::println);

           System.out.println("Find Employees by Id 1");
           System.out.println(employeeRepository.findEmployeeById(1L));

           System.out.println("Find Employees By Email");
           employeeRepository.findEmployeeByEmail("ruju@gmail.com").ifPresentOrElse(System.out::println, () -> {
               System.out.println("Employee By Id ruju@gmail.com not found");
           });

           System.out.println("Find Employees by First Name And Last Name");
           employeeRepository.findEmployeeByFirstNameEqualsAndLastNameEquals("Ahamed", "Rujhan").forEach(System.out::println);

           System.out.println("Delete Employee By id");
           System.out.println(employeeRepository.deleteEmployeeById(1L));

       };
    }

}
