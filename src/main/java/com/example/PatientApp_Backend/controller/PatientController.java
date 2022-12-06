package com.example.PatientApp_Backend.controller;

import com.example.PatientApp_Backend.model.Patient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @PostMapping(path ="/add",consumes = "application/json",produces ="application/json")
    public String AddPatient(@RequestBody Patient p)
    {
        System.out.println(p.getName().toString());
        System.out.println(p.getPid());
        System.out.println(p.getAddress().toString());
        System.out.println(p.getContact());
        System.out.println(p.getDoa().toString());
        System.out.println(p.getImage().toString());
        System.out.println(p.getDname().toString());
        return "patient added successfully";
    }
    @GetMapping("/view")
    public String ViewPatient()
    {
        return "Welcome to view all";
    }
}
