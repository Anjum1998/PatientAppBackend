package com.example.PatientApp_Backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @PostMapping(path ="/add",consumes = "application/json",produces ="application/json")
    public String AddPatient()
    {
        return "patient added successfully";
    }
}
