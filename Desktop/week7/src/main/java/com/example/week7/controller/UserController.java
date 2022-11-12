package com.example.week7.controller;

import com.example.week7.dto.UserSignUpDto;
import com.example.week7.model.User;
import com.example.week7.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping ("/signUp")
    ResponseEntity<User>signUp(@RequestBody UserSignUpDto userSignUpDto) {
        User user1 = userService.userSingUp(userSignUpDto);
        return  new ResponseEntity<User>(user1,HttpStatus.CREATED);
    }

}
