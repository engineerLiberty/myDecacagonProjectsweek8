package com.example.week7.model;

import lombok.Data;

import javax.persistence.Table;
import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "firstName", nullable = false,
    length = 40,columnDefinition = "Text")
    private String firstName;
    @Column(name = "lastName", nullable = false,
            length = 40,columnDefinition = "Text")
    private String lastName;
    @Column(name = "email", nullable = false,
            unique = true,
            length = 40,columnDefinition = "Text")
    private String email;
    @Column(name = "dob", nullable = false,
            length = 40,columnDefinition = "Text")
    private LocalDate dob;
    @Column(name = "gender", nullable = false,
            length = 10,columnDefinition = "Text")
    private Gender gender;
}
