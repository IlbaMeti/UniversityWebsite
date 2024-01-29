package com.example.beder.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "new_application")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String birthdate;
    private String city;
    private String school;
    private double average;
    private String phone;
    private String email;
    private String programType;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "app_bachelorProgram")
    private Bachelor programsBachelor;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "app_masterProgram")
    private Master programsMaster;

}
