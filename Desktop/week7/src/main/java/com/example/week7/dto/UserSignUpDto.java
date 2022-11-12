package com.example.week7.dto;

import com.example.week7.model.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserSignUpDto {
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate dob;
    private Gender gender;
}
