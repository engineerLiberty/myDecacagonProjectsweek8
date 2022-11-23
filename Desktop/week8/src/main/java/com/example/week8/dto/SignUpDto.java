package com.example.week8.dto;


import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;

@Data
@RequiredArgsConstructor
public class SignUpDto {

    private String firstName;

    private String lastName;

    @Column(unique = true)
    private String userName;

    private String password;
}
