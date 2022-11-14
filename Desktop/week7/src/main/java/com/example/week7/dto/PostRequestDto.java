package com.example.week7.dto;

import lombok.Data;

import java.util.Date;

@Data
public class PostRequestDto {
    private Long id;
    private String postContent;
    private Date postDate;
}

