package com.example.attendence_manager_new.exceptionhandling.exception;


import java.io.Serial;


//read failed exception

public class ResourceNotFoundException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException (String msg) {
        super(msg);
    }
}
