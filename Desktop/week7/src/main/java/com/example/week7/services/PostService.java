package com.example.week7.services;

import com.example.week7.dto.PostRequestDto;
import com.example.week7.model.Post;

import java.util.List;

public interface PostService {
    String creatPost(PostRequestDto postRequestDto, Long userId);
    List<Post> findPostByUserId(Long userId);
}
