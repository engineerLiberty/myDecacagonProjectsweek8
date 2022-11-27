package com.example.week8.serviceImpl;

import com.example.week8.dto.LogInDto;
import com.example.week8.dto.SignUpDto;
import com.example.week8.repositories.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class UserServiceImplTest {


    @Autowired
     private UserServiceImpl service;
    @Autowired
    private UserRepo userRepo;

    @Test
    void signUp() {
        SignUpDto signUp = new SignUpDto();
        signUp.setFirstName("liberty");
        signUp.setLastName("Austine");
        signUp.setUserName("libAustine");
        signUp.setPassword("1234");

        assertEquals("liberty",service.signUp(signUp).getFirstName());
    }

    @Test
    void logIn() {
        LogInDto logInDto = new LogInDto();
        logInDto.setUserName("libAustine");
        logInDto.setPassword("1234");
        assertEquals("1234",service.logIn(logInDto).getPassword());
    }
}