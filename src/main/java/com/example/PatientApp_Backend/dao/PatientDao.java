package com.example.PatientApp_Backend.dao;


import com.example.PatientApp_Backend.model.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientDao extends CrudRepository<Patient,Integer> {
}
