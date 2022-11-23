package com.example.week8.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@RequiredArgsConstructor
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long taskId;

    @Column(nullable = false)
    private String title;

    @Column(length = 150)
    private String taskDescription;

    @CreationTimestamp
    private LocalDate startDate;


    private LocalDate completedDate;

    @UpdateTimestamp
    private LocalDate lastUpdated;

    private boolean isComplete;

   @ManyToOne
   @JoinColumn(name = "userId")
    private User user;
}
