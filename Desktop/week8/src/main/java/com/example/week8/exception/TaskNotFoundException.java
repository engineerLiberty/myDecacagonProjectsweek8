package com.example.week8.exception;

import lombok.Data;
import org.aspectj.bridge.Message;

import java.text.MessageFormat;

@Data
public class TaskNotFoundException extends RuntimeException{
    public TaskNotFoundException(Long id){
        super(MessageFormat.format("Could not find task with is: {0}", id));
    }
}
