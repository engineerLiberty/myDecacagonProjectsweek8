package com.example.week8.dto;

import com.example.week8.enums.Status;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import java.time.LocalDate;

@Data
@RequiredArgsConstructor

public class TaskDto {
    private Long taskId;

    private Long userId;

    private String title;
    private String status;


    private String taskDescription;

    private String completedDate;




}
