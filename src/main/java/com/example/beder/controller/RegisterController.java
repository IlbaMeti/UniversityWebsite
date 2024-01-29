package com.example.beder.controller;

import com.example.beder.model.Student;
import com.example.beder.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/beder")
public class RegisterController {

    @Autowired
    RegistrationService registrationService;

    @PostMapping("/register")
    public ResponseEntity<?> registerStudent(@RequestBody Student student){
        registrationService.registerStudent(student);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/applied-students")
    public ResponseEntity<?> getListAppliedStudents(){
        List<Student> list = registrationService.getListAppliedStudents();
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
}
