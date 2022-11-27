package com.example.week8.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;

@RequiredArgsConstructor
@Data
public class UserDto {
    private String firstName;
    private String lastName;

    private String userName;

    private String password;
}

//
//{
//        "firstName": "Domek",
//        "lastName":"fresh",
//        "userName":"alib",
//        "password":"1234"
//        }


//{
//        "userId":"1",
//        "title": "Domek",
//        "taskDescription":"fresh pistle streesing man",
//        "startDate":"2/2/2020",
//        "completedDate":"4/06/2022"
//        }


//"userId":"1",
//        "title": "Domek",
//        "taskDescription":"fresh pistle streesing man",

