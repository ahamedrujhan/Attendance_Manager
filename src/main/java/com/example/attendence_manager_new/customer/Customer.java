package com.example.attendence_manager_new.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {

        private final long id;
        private final String name;


        private final String password;

        //Constructor
        public Customer(long id, String name, String password) {
            this.id = id;
            this.name = name;
            this.password = password;
        }

        @JsonIgnore
        public String getPassword() {
        return password;
    }

    @JsonProperty("customerId")
    public long getId() {
            return id;
        }

        public String getName() {
            return name;
        }
        // No setters because these are constants

}
