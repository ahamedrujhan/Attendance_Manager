package com.example.attendence_manager_new;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@SpringBootApplication
@EnableFeignClients
public class AttendenceManagerNewApplication {

    public static void main(String[] args) {
        SpringApplication.run(AttendenceManagerNewApplication.class, args);
    }



}
