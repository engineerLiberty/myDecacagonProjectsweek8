package com.example.week7.services;

import com.example.week7.dto.UserSignUpDto;
import com.example.week7.model.User;

public interface UserService {
    User userSingUp(UserSignUpDto userSignUpDto);

}
