package com.example.week8.controller;

import com.example.week8.dto.LogInDto;
import com.example.week8.dto.SignUpDto;
import com.example.week8.entity.User;
import com.example.week8.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserService userService;


    @PostMapping("/signUp")
    public ResponseEntity<String>signUpToApp(@RequestBody SignUpDto signUpDto){
        userService.signUp(signUpDto);
        return new ResponseEntity<>("Sign up successful", HttpStatus.CREATED);

    }

    @PostMapping("/logIn")
    public ResponseEntity<String> logIn(@RequestBody LogInDto logInDto){
        userService.logIn(logInDto);
        return new ResponseEntity<>("Login was successful",HttpStatus.ACCEPTED);
    }
    @GetMapping("/listOfUsers")
    public ResponseEntity<String> findAllUsers(){
      userService.findAll();
        return new ResponseEntity<>("List printed successfully",HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/deleteUser")
    public ResponseEntity<String> deleteUser(@RequestBody Long userId) {
        userService.deleteUser(userId);
        return new ResponseEntity<>("Deleted successfully", HttpStatus.ACCEPTED);
    }
}
