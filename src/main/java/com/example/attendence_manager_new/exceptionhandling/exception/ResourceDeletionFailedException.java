package com.example.attendence_manager_new.exceptionhandling.exception;

import java.io.Serial;


//Delete failed exception

public class ResourceDeletionFailedException extends RuntimeException{
    @Serial
    private final static long serialVersionUID = 1L;

    public ResourceDeletionFailedException (String msg) {
        super(msg);
    }
}
