package com.example.attendence_manager_new.customer;

public class Customer {

        private final long id;
        private final String name;

        //Constructor
        public Customer(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public long getId() {
            return id;
        }

        public String getName() {
            return name;
        }
        // No setters because these are constants

}
