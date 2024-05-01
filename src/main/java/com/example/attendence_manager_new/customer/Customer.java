package com.example.attendence_manager_new.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table
public class Customer {

        @Id
        private long id;
       @NotBlank(message = "Name must not be empty")
        private  String name;


       @NotBlank(message = "Password must not be empty")
        @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
        private  String password;

       @Email(message = "Enter Valid Email")
       private  String email;
        //Constructor
        public Customer(long id, String name, String password, String email) {
            this.id = id;
            this.name = name;
            this.password = password;
            this.email = email;
        }

    public Customer() {

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
        // No setters because these are final

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
