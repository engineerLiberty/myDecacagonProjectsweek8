package com.example.week7.services;

import com.example.week7.dto.PostRequestDto;

public interface PostService {
    String creatPost(PostRequestDto postRequestDto, Long userId);
    String fetchUserAllPost(Long userId);
}
