package com.example.week8.exception;

import lombok.Data;

import java.text.MessageFormat;

@Data
public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
