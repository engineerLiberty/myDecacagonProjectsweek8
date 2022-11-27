package com.example.week8.service;

import com.example.week8.dto.LogInDto;
import com.example.week8.dto.SignUpDto;
import com.example.week8.dto.UserDto;
import com.example.week8.entity.User;

import java.util.List;

public interface UserService {
     User signUp(SignUpDto signUpDto);
     User logIn(LogInDto logInDto);


//     User getUserByUserName(User user);
//
//     boolean isUserPresent(String userName);
//
     void  deleteUser(Long userId);

}
