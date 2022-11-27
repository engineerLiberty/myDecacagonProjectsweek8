package com.example.week8.entity;

import com.example.week8.enums.Status;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Persister;
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


    private Status status;

    @CreationTimestamp
    private LocalDate startDate;


    private LocalDate completedDate;

    @UpdateTimestamp
    private LocalDate lastUpdated;

    private boolean isComplete= false;

   @ManyToOne
   @JoinColumn(name = "userId")
    private User user;
   @PrePersist
    public void prePersist(){
       this.status = Status.InProgress;
   }

}
