package com.coffeemanagement.exception;

import java.util.function.Supplier;

public class EntityNotFoundException extends RuntimeException{
    public EntityNotFoundException() {
        super();
    }

    public EntityNotFoundException(String className, Long resourceId){
        this(className+" with id '"+resourceId+"' not found.");
    }

    public EntityNotFoundException(String message) {
        super(message);
    }

}