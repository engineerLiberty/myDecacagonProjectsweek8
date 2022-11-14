package com.example.week7.exception;

import com.example.week7.model.User;
import lombok.Data;

@Data

public class InvalidInputException {
    public String invalidInput(){
        return "filed can not be left empty";
    }
}
