package com.example.PatientApp_Backend.dao;


import com.example.PatientApp_Backend.model.Patient;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientDao extends CrudRepository<Patient,Integer> {
    @Query(value = "SELECT `id`, `address`, `contact`, `dname`, `doa`, `image`, `name`, `pid` FROM `patients` WHERE `pid`= :pid",nativeQuery = true)
    List<Patient> SearchPatient(@Param("pid") Integer pid);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `patients` WHERE `id`= :id",nativeQuery = true)
    void DeletePatient(@Param("id") Integer id);

}
