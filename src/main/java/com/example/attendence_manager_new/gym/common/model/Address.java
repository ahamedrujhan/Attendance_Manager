package com.example.attendence_manager_new.gym.common.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String number;
    private String street;
    private String city;
    private String state;
    private String country;
    private String postalCode;
}
