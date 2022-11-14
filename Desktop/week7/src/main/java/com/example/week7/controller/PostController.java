package com.example.week7.controller;

import com.example.week7.dto.PostRequestDto;
import com.example.week7.model.Post;
import com.example.week7.model.User;
import com.example.week7.services.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.*;

@Controller

public class PostController {
//    public final PostService postService;
//
//    public PostController(PostService postService) {
//        this.postService = postService;
//    }
    @GetMapping("/post")
    public String displayPosts(){
        return "post";
    }
}
