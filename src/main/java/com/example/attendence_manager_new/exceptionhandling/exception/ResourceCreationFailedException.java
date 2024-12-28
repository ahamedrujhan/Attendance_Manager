package com.example.attendence_manager_new.exceptionhandling.exception;

import java.io.Serial;

//create failed exception

public class ResourceCreationFailedException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;

    public ResourceCreationFailedException (String msg) {
        super(msg);
    }
}
