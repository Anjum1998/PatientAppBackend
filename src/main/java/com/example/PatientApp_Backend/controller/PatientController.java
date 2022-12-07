package com.example.PatientApp_Backend.controller;

import com.example.PatientApp_Backend.dao.PatientDao;
import com.example.PatientApp_Backend.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PatientController {
    @Autowired
    private PatientDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public Map<String,String> AddPatient(@RequestBody Patient p) {
        System.out.println(p.getName().toString());
        System.out.println(p.getPid());
        System.out.println(p.getAddress().toString());
        System.out.println(p.getContact());
        System.out.println(p.getDoa().toString());
        System.out.println(p.getImage().toString());
        System.out.println(p.getDname().toString());
        dao.save(p);
        HashMap<String, String> map=new HashMap<>();
        map.put("status","success");
        return map;


    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Patient> ViewPatient() {
        return (List<Patient>) dao.findAll();
    }
}
